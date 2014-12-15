package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class Document extends com.sforce.soap.metadata.MetadataWithContent {

    /**
     * Constructor
     */
    public Document() {}

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
     * element : internalUseOnly of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo internalUseOnly__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","internalUseOnly","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean internalUseOnly__is_set = false;

    private boolean internalUseOnly;

    public boolean getInternalUseOnly() {
      return internalUseOnly;
    }

    public boolean isInternalUseOnly() {
      return internalUseOnly;
    }

    public void setInternalUseOnly(boolean internalUseOnly) {
      this.internalUseOnly = internalUseOnly;
      internalUseOnly__is_set = true;
    }

    /**
     * element : keywords of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo keywords__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","keywords","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean keywords__is_set = false;

    private java.lang.String keywords;

    public java.lang.String getKeywords() {
      return keywords;
    }

    public void setKeywords(java.lang.String keywords) {
      this.keywords = keywords;
      keywords__is_set = true;
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","name","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean name__is_set = false;

    private java.lang.String name;

    public java.lang.String getName() {
      return name;
    }

    public void setName(java.lang.String name) {
      this.name = name;
      name__is_set = true;
    }

    /**
     * element : public of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo _public__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","public","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean _public__is_set = false;

    private boolean _public;

    public boolean getPublic() {
      return _public;
    }

    public boolean isPublic() {
      return _public;
    }

    public void setPublic(boolean _public) {
      this._public = _public;
      _public__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "Document");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeBoolean(__out, internalUseOnly__typeInfo, internalUseOnly, internalUseOnly__is_set);
       __typeMapper.writeString(__out, keywords__typeInfo, keywords, keywords__is_set);
       __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
       __typeMapper.writeBoolean(__out, _public__typeInfo, _public, _public__is_set);
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
        if (__typeMapper.isElement(__in, description__typeInfo)) {
            setDescription(__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, internalUseOnly__typeInfo)) {
            setInternalUseOnly(__typeMapper.readBoolean(__in, internalUseOnly__typeInfo, boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, keywords__typeInfo)) {
            setKeywords(__typeMapper.readString(__in, keywords__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, name__typeInfo)) {
            setName(__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, _public__typeInfo)) {
            setPublic(__typeMapper.readBoolean(__in, _public__typeInfo, boolean.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[Document ");
      sb.append(super.toString());sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" internalUseOnly='").append(com.sforce.ws.util.Verbose.toString(internalUseOnly)).append("'\n");
      sb.append(" keywords='").append(com.sforce.ws.util.Verbose.toString(keywords)).append("'\n");
      sb.append(" name='").append(com.sforce.ws.util.Verbose.toString(name)).append("'\n");
      sb.append(" _public='").append(com.sforce.ws.util.Verbose.toString(_public)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}