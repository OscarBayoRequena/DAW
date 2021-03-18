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
                        <xsl:if test="hitbox/@alto &gt; 0.7">
                        
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
                                        <li>Grupo: <xsl:value-of select="@grupo"/></li>
                                        <li>Tipo: <xsl:value-of select="tipo"/></li>
                                    </ul>
                                    <br/>
                                </td>
                            </tr>    
                            
                        </xsl:if>
                        
                    </xsl:for-each>      
                </table>     
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
