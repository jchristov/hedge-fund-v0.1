package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class CorsWhitelistOrigin extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public CorsWhitelistOrigin() {}

    /**
     * element : urlPattern of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo urlPattern__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","urlPattern","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean urlPattern__is_set = false;

    private java.lang.String urlPattern;

    public java.lang.String getUrlPattern() {
      return urlPattern;
    }

    public void setUrlPattern(java.lang.String urlPattern) {
      this.urlPattern = urlPattern;
      urlPattern__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "CorsWhitelistOrigin");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeString(__out, urlPattern__typeInfo, urlPattern, urlPattern__is_set);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        super.loadFields(__in, __typeMapper);
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, urlPattern__typeInfo)) {
            setUrlPattern(__typeMapper.readString(__in, urlPattern__typeInfo, java.lang.String.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[CorsWhitelistOrigin ");
      sb.append(super.toString());sb.append(" urlPattern='").append(com.sforce.ws.util.Verbose.toString(urlPattern)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}