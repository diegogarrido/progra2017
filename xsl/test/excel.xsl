<xsl:stylesheet 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:ms="urn:schemas-microsoft-com:xslt"
    xmlns:ss="urn:schemas-microsoft-com:office:spreadsheet"
    xmlns="urn:schemas-microsoft-com:office:spreadsheet"
    version="1.0">
    <xsl:template match="course">
        <Row>
            <xsl:for-each select="student">
                <Row>
                    <Cell>
                        <xsl:apply-templates select="name"/>
                    </Cell>
                    <Row>
                        <xsl:apply-templates select="final"/>
                    </Row>
                </Row>
            </xsl:for-each>
        </Row>
    </xsl:template>
</xsl:stylesheet>