package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class WorkspaceMapping implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public WorkspaceMapping() {}

    /**
     * element : fieldName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo fieldName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fieldName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean fieldName__is_set = false;

    private java.lang.String fieldName;

    public java.lang.String getFieldName() {
      return fieldName;
    }

    public void setFieldName(java.lang.String fieldName) {
      this.fieldName = fieldName;
      fieldName__is_set = true;
    }

    /**
     * element : tab of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo tab__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","tab","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean tab__is_set = false;

    private java.lang.String tab;

    public java.lang.String getTab() {
      return tab;
    }

    public void setTab(java.lang.String tab) {
      this.tab = tab;
      tab__is_set = true;
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
       __typeMapper.writeString(__out, fieldName__typeInfo, fieldName, fieldName__is_set);
       __typeMapper.writeString(__out, tab__typeInfo, tab, tab__is_set);
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
        if (__typeMapper.isElement(__in, fieldName__typeInfo)) {
            setFieldName(__typeMapper.readString(__in, fieldName__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, tab__typeInfo)) {
            setTab(__typeMapper.readString(__in, tab__typeInfo, java.lang.String.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[WorkspaceMapping ");
      sb.append(" fieldName='").append(com.sforce.ws.util.Verbose.toString(fieldName)).append("'\n");
      sb.append(" tab='").append(com.sforce.ws.util.Verbose.toString(tab)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}