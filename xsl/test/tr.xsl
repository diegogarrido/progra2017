<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
 <xsl:template match="course">
 <HTML>
 <HEAD><TITLE>Name of students</TITLE></HEAD>
 <BODY>
 <xsl:apply-templates select="student"/>
 </BODY>
 </HTML>
 </xsl:template>
 <xsl:template match="name">
 <P><xsl:value-of select="name"/></P>
 </xsl:template>
</xsl:stylesheet> 