<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="/minecraft/mobs">
        <html>
            <head>
                <title>infoGeneral.xsl</title>
                <link rel="stylesheet" type="text/css" href="estiloDatosGenerales.css" media="screen"/>
            </head>
            <body>
                <!--<table>
                    <tr><th>Nombre</th></tr>
                    
                    <xsl:for-each select='mob' >
                        <tr>
                        <td><xsl:value-of select="nombre"/></td>
                        </tr>
                    </xsl:for-each>
                </table>  -->
                <xsl:for-each select='mob' >
                    <xsl:sort select="nombre" order="ascending" />
                        
                        <div class="registro">
                            <h1>
                                <xsl:value-of select="nombre"/>
                            </h1>
                            <div class="datos">                       
                                <img>
                                    <xsl:attribute name="src">
                                        <xsl:value-of select="imagen"/>
                                    </xsl:attribute>
                                    <xsl:attribute name="alt">
                                        imagen del mob
                                    </xsl:attribute>
                                </img>
                                <hr/>
                                <table>
                                    <tr>
                                        <th colspan="2">
                                            Identificadores
                                        </th>
                                    </tr>
                                    <tr>
                                        <td>
                                            Java
                                        </td>
                                        <td>
                                            <xsl:value-of select="@javaId"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Bedrock
                                        </td>
                                        <td>
                                            <xsl:value-of select="@BEId"/>
                                        </td>
                                    </tr>
                                
                                    <tr>
                                        <th colspan="2">
                                            Grupo
                                        </th>
                                    </tr>
                                    <tr>
                                        <td colspan="2">
                                            <xsl:value-of select="@grupo"/>
                                        </td>
                                    </tr>
                                
                                    <tr>
                                        <th colspan="2">
                                            Tipo
                                        </th>
                                    </tr>
                                    <tr>
                                        <td colspan="2">
                                            <xsl:value-of select="tipo"/>
                                        </td>
                                    </tr>
                                
                                    <tr>
                                        <th colspan="2">
                                            Stats
                                        </th>
                                    </tr>
                                    <tr>
                                        <td>
                                            Vida
                                        </td>
                                        <td>
                                            <xsl:value-of select="stats/vida"/>
                                        </td>
                                    </tr>
                                
                                    <xsl:for-each select="stats/ataque">
                                        <xsl:choose>
                                            <xsl:when test="ataqueFacil" >
                                            
                                                <tr>
                                                    <td>
                                                        Ataque en Fácil
                                                    </td>
                                                    <td>
                                                        <xsl:value-of select="ataqueFacil"/>
                                                    </td>
                                                </tr>
                                            
                                                <tr>
                                                    <td>
                                                        Ataque en Normal
                                                    </td>
                                                    <td>
                                                        <xsl:value-of select="ataqueNormal"/>
                                                    </td>
                                                </tr>
                                            
                                                <tr>
                                                    <td>
                                                        Ataque en Dificil
                                                    </td>
                                                    <td>
                                                        <xsl:value-of select="ataqueDificil"/>
                                                    </td>
                                                </tr>
                                            
                                            </xsl:when>
                                            <xsl:when test="sinDano" >
                                                <tr>
                                                    <td colspan="2">
                                                        Este mob no puede inflingir daño a nadie
                                                    </td>
                                                </tr>
                                            </xsl:when>
                                            <xsl:otherwise>
                                                <tr>
                                                    <th colspan="2">
                                                        Algo no funcionó
                                                    </th>
                                                </tr>
                                            </xsl:otherwise>
                                        </xsl:choose>
                                    </xsl:for-each>
                                
                                    <xsl:if test="stats/armadura">
                                        <tr>
                                            <td>
                                                Armadura
                                            </td>
                                            <td>
                                                <xsl:value-of select="stats/armadura"/>
                                            </td>
                                        </tr>
                                    </xsl:if>
                                
                                    <tr>
                                        <th colspan="2">
                                            Hitbox
                                        </th>
                                    </tr>
                                    <tr>
                                        <td>
                                            Ancho
                                        </td>
                                        <td>
                                            <xsl:value-of select="hitbox/@ancho" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Alto
                                        </td>
                                        <td>
                                            <xsl:value-of select="hitbox/@alto" />
                                        </td>
                                    </tr>
                                
                                    <tr>
                                        <th colspan="2">
                                            Drops
                                        </th>
                                    </tr>
                                    <xsl:choose>
                                        <xsl:when test="drops/drop">
                                            <xsl:for-each select="drops/drop">
                                                <tr>
                                                    <td colspan="2">
                                                        <xsl:value-of select="."/> 
                                                        <xsl:if test="@probabilidad">
                                                            (<xsl:value-of select="@probabilidad"/>%)
                                                        </xsl:if>
                                                    </td>
                                                </tr>
                                            </xsl:for-each>
                                        </xsl:when>
                                        <xsl:when test="drops/noDrop">
                                            <tr>
                                                <td colspan="2">
                                                    Este mob no suelta nada al morir
                                                </td>
                                            </tr>
                                        </xsl:when>
                                        <xsl:otherwise>
                                            Algo fue mal al leer la información sobre los drops
                                        </xsl:otherwise>
                                    </xsl:choose>
                                
                                
                                </table>
                            
                                <br/>
                            </div>
                            <p>
                                Información directamente sacada de la wiki de Minecraft
                                <br/>
                                <br/>
                                <xsl:value-of select="descripcion"/>
                                <br/>
                                <br/>
                                <xsl:value-of select="spawn"/>
                                <br/>
                                <br/>
                                Mas información en 
                                <a>
                                    <xsl:attribute name="href">
                                        <xsl:value-of select="enlaceMinecraftWiki"/>
                                    </xsl:attribute>
                                    su post
                                </a>
                            </p>
                        </div> 
                    
                </xsl:for-each>           
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
