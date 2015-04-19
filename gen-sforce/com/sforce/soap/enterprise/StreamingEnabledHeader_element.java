package com.sforce.soap.enterprise;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class StreamingEnabledHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public StreamingEnabledHeader_element() {}

    /**
     * element : streamingEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo streamingEnabled__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","streamingEnabled","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean streamingEnabled__is_set = false;

    private boolean streamingEnabled;

    public boolean getStreamingEnabled() {
      return streamingEnabled;
    }

    public boolean isStreamingEnabled() {
      return streamingEnabled;
    }

    public void setStreamingEnabled(boolean streamingEnabled) {
      this.streamingEnabled = streamingEnabled;
      streamingEnabled__is_set = true;
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
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeBoolean(__out, streamingEnabled__typeInfo, streamingEnabled, streamingEnabled__is_set);
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
        if (__typeMapper.verifyElement(__in, streamingEnabled__typeInfo)) {
            setStreamingEnabled(__typeMapper.readBoolean(__in, streamingEnabled__typeInfo, boolean.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[StreamingEnabledHeader_element ");
      sb.append(super.toString());sb.append(" streamingEnabled='").append(com.sforce.ws.util.Verbose.toString(streamingEnabled)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}