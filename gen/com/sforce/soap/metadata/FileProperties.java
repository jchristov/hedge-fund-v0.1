package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class FileProperties implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public FileProperties() {}

    /**
     * element : createdById of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo createdById__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","createdById","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean createdById__is_set = false;

    private java.lang.String createdById;

    public java.lang.String getCreatedById() {
      return createdById;
    }

    public void setCreatedById(java.lang.String createdById) {
      this.createdById = createdById;
      createdById__is_set = true;
    }

    /**
     * element : createdByName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo createdByName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","createdByName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean createdByName__is_set = false;

    private java.lang.String createdByName;

    public java.lang.String getCreatedByName() {
      return createdByName;
    }

    public void setCreatedByName(java.lang.String createdByName) {
      this.createdByName = createdByName;
      createdByName__is_set = true;
    }

    /**
     * element : createdDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo createdDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","createdDate","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true);

    private boolean createdDate__is_set = false;

    private java.util.Calendar createdDate;

    public java.util.Calendar getCreatedDate() {
      return createdDate;
    }

    public void setCreatedDate(java.util.Calendar createdDate) {
      this.createdDate = createdDate;
      createdDate__is_set = true;
    }

    /**
     * element : fileName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo fileName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fileName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean fileName__is_set = false;

    private java.lang.String fileName;

    public java.lang.String getFileName() {
      return fileName;
    }

    public void setFileName(java.lang.String fileName) {
      this.fileName = fileName;
      fileName__is_set = true;
    }

    /**
     * element : fullName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo fullName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fullName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean fullName__is_set = false;

    private java.lang.String fullName;

    public java.lang.String getFullName() {
      return fullName;
    }

    public void setFullName(java.lang.String fullName) {
      this.fullName = fullName;
      fullName__is_set = true;
    }

    /**
     * element : id of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo id__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","id","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean id__is_set = false;

    private java.lang.String id;

    public java.lang.String getId() {
      return id;
    }

    public void setId(java.lang.String id) {
      this.id = id;
      id__is_set = true;
    }

    /**
     * element : lastModifiedById of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo lastModifiedById__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","lastModifiedById","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean lastModifiedById__is_set = false;

    private java.lang.String lastModifiedById;

    public java.lang.String getLastModifiedById() {
      return lastModifiedById;
    }

    public void setLastModifiedById(java.lang.String lastModifiedById) {
      this.lastModifiedById = lastModifiedById;
      lastModifiedById__is_set = true;
    }

    /**
     * element : lastModifiedByName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo lastModifiedByName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","lastModifiedByName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean lastModifiedByName__is_set = false;

    private java.lang.String lastModifiedByName;

    public java.lang.String getLastModifiedByName() {
      return lastModifiedByName;
    }

    public void setLastModifiedByName(java.lang.String lastModifiedByName) {
      this.lastModifiedByName = lastModifiedByName;
      lastModifiedByName__is_set = true;
    }

    /**
     * element : lastModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo lastModifiedDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","lastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true);

    private boolean lastModifiedDate__is_set = false;

    private java.util.Calendar lastModifiedDate;

    public java.util.Calendar getLastModifiedDate() {
      return lastModifiedDate;
    }

    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
      this.lastModifiedDate = lastModifiedDate;
      lastModifiedDate__is_set = true;
    }

    /**
     * element : manageableState of type {http://soap.sforce.com/2006/04/metadata}ManageableState
     * java type: com.sforce.soap.metadata.ManageableState
     */
    private static final com.sforce.ws.bind.TypeInfo manageableState__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","manageableState","http://soap.sforce.com/2006/04/metadata","ManageableState",0,1,true);

    private boolean manageableState__is_set = false;

    private com.sforce.soap.metadata.ManageableState manageableState;

    public com.sforce.soap.metadata.ManageableState getManageableState() {
      return manageableState;
    }

    public void setManageableState(com.sforce.soap.metadata.ManageableState manageableState) {
      this.manageableState = manageableState;
      manageableState__is_set = true;
    }

    /**
     * element : namespacePrefix of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo namespacePrefix__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","namespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean namespacePrefix__is_set = false;

    private java.lang.String namespacePrefix;

    public java.lang.String getNamespacePrefix() {
      return namespacePrefix;
    }

    public void setNamespacePrefix(java.lang.String namespacePrefix) {
      this.namespacePrefix = namespacePrefix;
      namespacePrefix__is_set = true;
    }

    /**
     * element : type of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","type","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean type__is_set = false;

    private java.lang.String type;

    public java.lang.String getType() {
      return type;
    }

    public void setType(java.lang.String type) {
      this.type = type;
      type__is_set = true;
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
       __typeMapper.writeString(__out, createdById__typeInfo, createdById, createdById__is_set);
       __typeMapper.writeString(__out, createdByName__typeInfo, createdByName, createdByName__is_set);
       __typeMapper.writeObject(__out, createdDate__typeInfo, createdDate, createdDate__is_set);
       __typeMapper.writeString(__out, fileName__typeInfo, fileName, fileName__is_set);
       __typeMapper.writeString(__out, fullName__typeInfo, fullName, fullName__is_set);
       __typeMapper.writeString(__out, id__typeInfo, id, id__is_set);
       __typeMapper.writeString(__out, lastModifiedById__typeInfo, lastModifiedById, lastModifiedById__is_set);
       __typeMapper.writeString(__out, lastModifiedByName__typeInfo, lastModifiedByName, lastModifiedByName__is_set);
       __typeMapper.writeObject(__out, lastModifiedDate__typeInfo, lastModifiedDate, lastModifiedDate__is_set);
       __typeMapper.writeObject(__out, manageableState__typeInfo, manageableState, manageableState__is_set);
       __typeMapper.writeString(__out, namespacePrefix__typeInfo, namespacePrefix, namespacePrefix__is_set);
       __typeMapper.writeString(__out, type__typeInfo, type, type__is_set);
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
        if (__typeMapper.verifyElement(__in, createdById__typeInfo)) {
            setCreatedById(__typeMapper.readString(__in, createdById__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, createdByName__typeInfo)) {
            setCreatedByName(__typeMapper.readString(__in, createdByName__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, createdDate__typeInfo)) {
            setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, createdDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, fileName__typeInfo)) {
            setFileName(__typeMapper.readString(__in, fileName__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, fullName__typeInfo)) {
            setFullName(__typeMapper.readString(__in, fullName__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, id__typeInfo)) {
            setId(__typeMapper.readString(__in, id__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, lastModifiedById__typeInfo)) {
            setLastModifiedById(__typeMapper.readString(__in, lastModifiedById__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, lastModifiedByName__typeInfo)) {
            setLastModifiedByName(__typeMapper.readString(__in, lastModifiedByName__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, lastModifiedDate__typeInfo)) {
            setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, lastModifiedDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, manageableState__typeInfo)) {
            setManageableState((com.sforce.soap.metadata.ManageableState)__typeMapper.readObject(__in, manageableState__typeInfo, com.sforce.soap.metadata.ManageableState.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, namespacePrefix__typeInfo)) {
            setNamespacePrefix(__typeMapper.readString(__in, namespacePrefix__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, type__typeInfo)) {
            setType(__typeMapper.readString(__in, type__typeInfo, java.lang.String.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FileProperties ");
      sb.append(" createdById='").append(com.sforce.ws.util.Verbose.toString(createdById)).append("'\n");
      sb.append(" createdByName='").append(com.sforce.ws.util.Verbose.toString(createdByName)).append("'\n");
      sb.append(" createdDate='").append(com.sforce.ws.util.Verbose.toString(createdDate)).append("'\n");
      sb.append(" fileName='").append(com.sforce.ws.util.Verbose.toString(fileName)).append("'\n");
      sb.append(" fullName='").append(com.sforce.ws.util.Verbose.toString(fullName)).append("'\n");
      sb.append(" id='").append(com.sforce.ws.util.Verbose.toString(id)).append("'\n");
      sb.append(" lastModifiedById='").append(com.sforce.ws.util.Verbose.toString(lastModifiedById)).append("'\n");
      sb.append(" lastModifiedByName='").append(com.sforce.ws.util.Verbose.toString(lastModifiedByName)).append("'\n");
      sb.append(" lastModifiedDate='").append(com.sforce.ws.util.Verbose.toString(lastModifiedDate)).append("'\n");
      sb.append(" manageableState='").append(com.sforce.ws.util.Verbose.toString(manageableState)).append("'\n");
      sb.append(" namespacePrefix='").append(com.sforce.ws.util.Verbose.toString(namespacePrefix)).append("'\n");
      sb.append(" type='").append(com.sforce.ws.util.Verbose.toString(type)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}