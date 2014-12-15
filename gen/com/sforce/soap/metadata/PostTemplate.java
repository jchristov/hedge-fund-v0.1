package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class PostTemplate extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public PostTemplate() {}

    /**
     * element : default of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo _default__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","default","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean _default__is_set = false;

    private boolean _default;

    public boolean getDefault() {
      return _default;
    }

    public boolean isDefault() {
      return _default;
    }

    public void setDefault(boolean _default) {
      this._default = _default;
      _default__is_set = true;
    }

    /**
     * element : description of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo description__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","description","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean description__is_set = false;

    private java.lang.String description;

    public java.lang.String getDescription() {
      return description;
    }

    public void setDescription(java.lang.String description) {
      this.description = description;
      description__is_set = true;
    }

    /**
     * element : fields of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo fields__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fields","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

    private boolean fields__is_set = false;

    private java.lang.String[] fields = new java.lang.String[0];

    public java.lang.String[] getFields() {
      return fields;
    }

    public void setFields(java.lang.String[] fields) {
      this.fields = fields;
      fields__is_set = true;
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
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "PostTemplate");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeBoolean(__out, _default__typeInfo, _default, _default__is_set);
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeObject(__out, fields__typeInfo, fields, fields__is_set);
       __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
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
        if (__typeMapper.isElement(__in, _default__typeInfo)) {
            setDefault(__typeMapper.readBoolean(__in, _default__typeInfo, boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, description__typeInfo)) {
            setDescription(__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, fields__typeInfo)) {
            setFields((java.lang.String[])__typeMapper.readObject(__in, fields__typeInfo, java.lang.String[].class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, label__typeInfo)) {
            setLabel(__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[PostTemplate ");
      sb.append(super.toString());sb.append(" _default='").append(com.sforce.ws.util.Verbose.toString(_default)).append("'\n");
      sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" fields='").append(com.sforce.ws.util.Verbose.toString(fields)).append("'\n");
      sb.append(" label='").append(com.sforce.ws.util.Verbose.toString(label)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}