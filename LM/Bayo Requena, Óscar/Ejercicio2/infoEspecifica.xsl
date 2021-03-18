<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="/">
        <html>
            <head>
                <title>Información especifica de las personas</title>
                <link rel="stylesheet" type="text/css" href="estilosDatosEspecificos.css" media="screen"/>
            </head>
            
            <body>
                <table>
                    
                    <tr>
                        <th>Nombre</th>
                        <th>Apellidos</th>

                    </tr>
                    
                    <xsl:for-each select="personas/persona">
                        <xsl:sort select="apellidos" order="ascending" />
                        
                        <xsl:if test="nacimiento/@mes = 1">
                        
                            <xsl:choose>
                                <xsl:when test="@sexo = 'varon'">
                                    <tr class="enVerde">
                                        <td>
                                            <xsl:value-of select="nombre"/>
                                        </td>
                                        <td>
                                            <xsl:value-of select="apellidos"/>
                                        </td>
                                    </tr>
                                </xsl:when>
                                <xsl:when test="@sexo = 'mujer'">
                                    <tr class="enNaranja">
                                        <td>
                                            <xsl:value-of select="nombre"/>
                                        </td>
                                        <td>
                                            <xsl:value-of select="apellidos"/>
                                        </td>
                                    </tr>
                                </xsl:when>
                                <xsl:otherwise>
                                    <tr>
                                        <td>
                                            <xsl:value-of select="nombre"/>
                                        </td>
                                        <td>
                                            <xsl:value-of select="apellidos"/>
                                        </td>
                                    </tr>
                                </xsl:otherwise>
                            </xsl:choose>
                        </xsl:if>    
                        
                    </xsl:for-each>
                    
                </table>
                
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
