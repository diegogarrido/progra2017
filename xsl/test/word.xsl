<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="course">
        <xsl:processing-instruction name="mso-application">progid="Word.Document"</xsl:processing-instruction>
        <w:wordDocument xmlns:w="http://schemas.microsoft.com/office/word/2003/2/wordml">
            <w:body>
                <w:p>
                    <w:r>
			<xsl:value-of select="name"/>
                    </w:r>
		    <w:r>
			<xsl:apply-templates select="student"/>
		    </w:r>
                </w:p>
            </w:body>
        </w:wordDocument>
    </xsl:template>
</xsl:stylesheet>