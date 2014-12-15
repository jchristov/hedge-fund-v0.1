package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class LayoutColumn implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public LayoutColumn() {}

    /**
     * element : layoutItems of type {http://soap.sforce.com/2006/04/metadata}LayoutItem
     * java type: com.sforce.soap.metadata.LayoutItem[]
     */
    private static final com.sforce.ws.bind.TypeInfo layoutItems__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","layoutItems","http://soap.sforce.com/2006/04/metadata","LayoutItem",0,-1,true);

    private boolean layoutItems__is_set = false;

    private com.sforce.soap.metadata.LayoutItem[] layoutItems = new com.sforce.soap.metadata.LayoutItem[0];

    public com.sforce.soap.metadata.LayoutItem[] getLayoutItems() {
      return layoutItems;
    }

    public void setLayoutItems(com.sforce.soap.metadata.LayoutItem[] layoutItems) {
      this.layoutItems = layoutItems;
      layoutItems__is_set = true;
    }

    /**
     * element : reserved of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo reserved__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","reserved","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean reserved__is_set = false;

    private java.lang.String reserved;

    public java.lang.String getReserved() {
      return reserved;
    }

    public void setReserved(java.lang.String reserved) {
      this.reserved = reserved;
      reserved__is_set = true;
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
       __typeMapper.writeObject(__out, layoutItems__typeInfo, layoutItems, layoutItems__is_set);
       __typeMapper.writeString(__out, reserved__typeInfo, reserved, reserved__is_set);
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
        if (__typeMapper.isElement(__in, layoutItems__typeInfo)) {
            setLayoutItems((com.sforce.soap.metadata.LayoutItem[])__typeMapper.readObject(__in, layoutItems__typeInfo, com.sforce.soap.metadata.LayoutItem[].class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, reserved__typeInfo)) {
            setReserved(__typeMapper.readString(__in, reserved__typeInfo, java.lang.String.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[LayoutColumn ");
      sb.append(" layoutItems='").append(com.sforce.ws.util.Verbose.toString(layoutItems)).append("'\n");
      sb.append(" reserved='").append(com.sforce.ws.util.Verbose.toString(reserved)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}