package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class Queue extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public Queue() {}

    /**
     * element : doesSendEmailToMembers of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo doesSendEmailToMembers__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","doesSendEmailToMembers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean doesSendEmailToMembers__is_set = false;

    private boolean doesSendEmailToMembers;

    public boolean getDoesSendEmailToMembers() {
      return doesSendEmailToMembers;
    }

    public boolean isDoesSendEmailToMembers() {
      return doesSendEmailToMembers;
    }

    public void setDoesSendEmailToMembers(boolean doesSendEmailToMembers) {
      this.doesSendEmailToMembers = doesSendEmailToMembers;
      doesSendEmailToMembers__is_set = true;
    }

    /**
     * element : email of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo email__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","email","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean email__is_set = false;

    private java.lang.String email;

    public java.lang.String getEmail() {
      return email;
    }

    public void setEmail(java.lang.String email) {
      this.email = email;
      email__is_set = true;
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

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
     * element : queueSobject of type {http://soap.sforce.com/2006/04/metadata}QueueSobject
     * java type: com.sforce.soap.metadata.QueueSobject[]
     */
    private static final com.sforce.ws.bind.TypeInfo queueSobject__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","queueSobject","http://soap.sforce.com/2006/04/metadata","QueueSobject",0,-1,true);

    private boolean queueSobject__is_set = false;

    private com.sforce.soap.metadata.QueueSobject[] queueSobject = new com.sforce.soap.metadata.QueueSobject[0];

    public com.sforce.soap.metadata.QueueSobject[] getQueueSobject() {
      return queueSobject;
    }

    public void setQueueSobject(com.sforce.soap.metadata.QueueSobject[] queueSobject) {
      this.queueSobject = queueSobject;
      queueSobject__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "Queue");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeBoolean(__out, doesSendEmailToMembers__typeInfo, doesSendEmailToMembers, doesSendEmailToMembers__is_set);
       __typeMapper.writeString(__out, email__typeInfo, email, email__is_set);
       __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
       __typeMapper.writeObject(__out, queueSobject__typeInfo, queueSobject, queueSobject__is_set);
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
        if (__typeMapper.isElement(__in, doesSendEmailToMembers__typeInfo)) {
            setDoesSendEmailToMembers(__typeMapper.readBoolean(__in, doesSendEmailToMembers__typeInfo, boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, email__typeInfo)) {
            setEmail(__typeMapper.readString(__in, email__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, name__typeInfo)) {
            setName(__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, queueSobject__typeInfo)) {
            setQueueSobject((com.sforce.soap.metadata.QueueSobject[])__typeMapper.readObject(__in, queueSobject__typeInfo, com.sforce.soap.metadata.QueueSobject[].class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[Queue ");
      sb.append(super.toString());sb.append(" doesSendEmailToMembers='").append(com.sforce.ws.util.Verbose.toString(doesSendEmailToMembers)).append("'\n");
      sb.append(" email='").append(com.sforce.ws.util.Verbose.toString(email)).append("'\n");
      sb.append(" name='").append(com.sforce.ws.util.Verbose.toString(name)).append("'\n");
      sb.append(" queueSobject='").append(com.sforce.ws.util.Verbose.toString(queueSobject)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}