<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="/">
        <html>
            <head>
                <title>infoGeneral.xsl</title>
                <link rel="stylesheet" type="text/css" href="estilosDatosGenerales.css" media="screen"/>
            </head>
            
            <body>
                <table>
                    
                    <tr>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Sexo</th>
                        <th>Relación</th>
                        <th>Fecha de nacimiento</th>
                        <th>Direcciones</th>
                    </tr>
                    
                    <xsl:for-each select="personas/persona">
                        <xsl:sort select="apellidos" order="ascending" />
                    
                        <tr>
                            <td>
                                <xsl:value-of select="nombre"/>
                            </td>
                            <td>
                                <xsl:value-of select="apellidos"/>
                            </td>
                            <td>
                                <xsl:value-of select="@sexo"/>
                            </td>
                            <td>
                                <xsl:value-of select="@relacion"/>
                            </td>
                            <td>
                                <xsl:value-of select="nacimiento/@dia"/>/<xsl:value-of select="nacimiento/@mes"/>/<xsl:value-of select="nacimiento/@anio"/>
                            </td>
                            <td>
                                <xsl:for-each select="direcciones/direccion">
                                    <table class="sinBordes">
                                        <tr>
                                            <td>
                                                Tipo: <xsl:value-of select="@tipo"/>
                                                <br/>
                                                <xsl:value-of select="provincia"/>,  <xsl:value-of select="poblacion"/>,  <xsl:value-of select="calle"/>.  CP:<xsl:value-of select="cpostal"/>
                                                
                                            </td>
                                        </tr>
                                    </table>
                                </xsl:for-each>
                            </td>
                        </tr>
                        
                    </xsl:for-each>
                    
                </table>
                
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
