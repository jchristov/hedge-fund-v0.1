package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class State implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public State() {}

    /**
     * element : active of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo active__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean active__is_set = false;

    private boolean active;

    public boolean getActive() {
      return active;
    }

    public boolean isActive() {
      return active;
    }

    public void setActive(boolean active) {
      this.active = active;
      active__is_set = true;
    }

    /**
     * element : integrationValue of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo integrationValue__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","integrationValue","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean integrationValue__is_set = false;

    private java.lang.String integrationValue;

    public java.lang.String getIntegrationValue() {
      return integrationValue;
    }

    public void setIntegrationValue(java.lang.String integrationValue) {
      this.integrationValue = integrationValue;
      integrationValue__is_set = true;
    }

    /**
     * element : isoCode of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo isoCode__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","isoCode","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean isoCode__is_set = false;

    private java.lang.String isoCode;

    public java.lang.String getIsoCode() {
      return isoCode;
    }

    public void setIsoCode(java.lang.String isoCode) {
      this.isoCode = isoCode;
      isoCode__is_set = true;
    }

    /**
     * element : label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean label__is_set = false;

    private java.lang.String label;

    public java.lang.String getLabel() {
      return label;
    }

    public void setLabel(java.lang.String label) {
      this.label = label;
      label__is_set = true;
    }

    /**
     * element : standard of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo standard__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","standard","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean standard__is_set = false;

    private boolean standard;

    public boolean getStandard() {
      return standard;
    }

    public boolean isStandard() {
      return standard;
    }

    public void setStandard(boolean standard) {
      this.standard = standard;
      standard__is_set = true;
    }

    /**
     * element : visible of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo visible__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","visible","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean visible__is_set = false;

    private boolean visible;

    public boolean getVisible() {
      return visible;
    }

    public boolean isVisible() {
      return visible;
    }

    public void setVisible(boolean visible) {
      this.visible = visible;
      visible__is_set = true;
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
       __typeMapper.writeBoolean(__out, active__typeInfo, active, active__is_set);
       __typeMapper.writeString(__out, integrationValue__typeInfo, integrationValue, integrationValue__is_set);
       __typeMapper.writeString(__out, isoCode__typeInfo, isoCode, isoCode__is_set);
       __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
       __typeMapper.writeBoolean(__out, standard__typeInfo, standard, standard__is_set);
       __typeMapper.writeBoolean(__out, visible__typeInfo, visible, visible__is_set);
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
        if (__typeMapper.verifyElement(__in, active__typeInfo)) {
            setActive(__typeMapper.readBoolean(__in, active__typeInfo, boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, integrationValue__typeInfo)) {
            setIntegrationValue(__typeMapper.readString(__in, integrationValue__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, isoCode__typeInfo)) {
            setIsoCode(__typeMapper.readString(__in, isoCode__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, label__typeInfo)) {
            setLabel(__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, standard__typeInfo)) {
            setStandard(__typeMapper.readBoolean(__in, standard__typeInfo, boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, visible__typeInfo)) {
            setVisible(__typeMapper.readBoolean(__in, visible__typeInfo, boolean.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[State ");
      sb.append(" active='").append(com.sforce.ws.util.Verbose.toString(active)).append("'\n");
      sb.append(" integrationValue='").append(com.sforce.ws.util.Verbose.toString(integrationValue)).append("'\n");
      sb.append(" isoCode='").append(com.sforce.ws.util.Verbose.toString(isoCode)).append("'\n");
      sb.append(" label='").append(com.sforce.ws.util.Verbose.toString(label)).append("'\n");
      sb.append(" standard='").append(com.sforce.ws.util.Verbose.toString(standard)).append("'\n");
      sb.append(" visible='").append(com.sforce.ws.util.Verbose.toString(visible)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}