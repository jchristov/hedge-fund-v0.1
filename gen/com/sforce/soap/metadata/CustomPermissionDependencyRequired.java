package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class CustomPermissionDependencyRequired implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public CustomPermissionDependencyRequired() {}

    /**
     * element : customPermission of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo customPermission__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","customPermission","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean customPermission__is_set = false;

    private java.lang.String customPermission;

    public java.lang.String getCustomPermission() {
      return customPermission;
    }

    public void setCustomPermission(java.lang.String customPermission) {
      this.customPermission = customPermission;
      customPermission__is_set = true;
    }

    /**
     * element : dependency of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo dependency__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","dependency","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean dependency__is_set = false;

    private boolean dependency;

    public boolean getDependency() {
      return dependency;
    }

    public boolean isDependency() {
      return dependency;
    }

    public void setDependency(boolean dependency) {
      this.dependency = dependency;
      dependency__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       __typeMapper.writeString(__out, customPermission__typeInfo, customPermission, customPermission__is_set);
       __typeMapper.writeBoolean(__out, dependency__typeInfo, dependency, dependency__is_set);
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
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, customPermission__typeInfo)) {
            setCustomPermission(__typeMapper.readString(__in, customPermission__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, dependency__typeInfo)) {
            setDependency(__typeMapper.readBoolean(__in, dependency__typeInfo, boolean.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[CustomPermissionDependencyRequired ");
      sb.append(" customPermission='").append(com.sforce.ws.util.Verbose.toString(customPermission)).append("'\n");
      sb.append(" dependency='").append(com.sforce.ws.util.Verbose.toString(dependency)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}