<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="/minecraft/mobs">
        <html>
            <head>
                <title>infoGeneral.xsl</title>
                <link rel="stylesheet" type="text/css" href="estiloDatosTabla.css" media="screen"/>
            </head>
            <body>
                
                <table>
                    <xsl:for-each select='mob' >
                        <xsl:sort select="hitbox/@ancho" order="ascending" />
                        <xsl:if test="stats/ataque/ataqueFacil = 2">
                        
                            <tr>
                                <!--
                                <td>
                                    <img>
                                        <xsl:attribute name="src">
                                            <xsl:value-of select="imagen"/>
                                        </xsl:attribute>
                                        <xsl:attribute name="alt">
                                            imagen del mob
                                        </xsl:attribute>
                                    </img>
                                </td>-->
                                <td>
                                    <h1>
                                        <xsl:value-of select="nombre"/>
                                    </h1>
                                    <ul>
                                        <li>Tipo: <xsl:value-of select="tipo"/></li>
                                        <li>Vida: <xsl:value-of select="stats/vida"/></li>
                                        <br/>
                                    </ul>
                                </td>
                            </tr>    
                            
                        </xsl:if>
                        
                    </xsl:for-each>    
                </table>       
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
