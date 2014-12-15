package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class AccountTerritorySharingRule extends com.sforce.soap.metadata.OwnerSharingRule {

    /**
     * Constructor
     */
    public AccountTerritorySharingRule() {}

    /**
     * element : accountAccessLevel of type {http://soap.sforce.com/2006/04/metadata}ShareAccessLevelNoNone
     * java type: com.sforce.soap.metadata.ShareAccessLevelNoNone
     */
    private static final com.sforce.ws.bind.TypeInfo accountAccessLevel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","accountAccessLevel","http://soap.sforce.com/2006/04/metadata","ShareAccessLevelNoNone",1,1,true);

    private boolean accountAccessLevel__is_set = false;

    private com.sforce.soap.metadata.ShareAccessLevelNoNone accountAccessLevel;

    public com.sforce.soap.metadata.ShareAccessLevelNoNone getAccountAccessLevel() {
      return accountAccessLevel;
    }

    public void setAccountAccessLevel(com.sforce.soap.metadata.ShareAccessLevelNoNone accountAccessLevel) {
      this.accountAccessLevel = accountAccessLevel;
      accountAccessLevel__is_set = true;
    }

    /**
     * element : caseAccessLevel of type {http://soap.sforce.com/2006/04/metadata}ShareAccessLevelNoAll
     * java type: com.sforce.soap.metadata.ShareAccessLevelNoAll
     */
    private static final com.sforce.ws.bind.TypeInfo caseAccessLevel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","caseAccessLevel","http://soap.sforce.com/2006/04/metadata","ShareAccessLevelNoAll",1,1,true);

    private boolean caseAccessLevel__is_set = false;

    private com.sforce.soap.metadata.ShareAccessLevelNoAll caseAccessLevel;

    public com.sforce.soap.metadata.ShareAccessLevelNoAll getCaseAccessLevel() {
      return caseAccessLevel;
    }

    public void setCaseAccessLevel(com.sforce.soap.metadata.ShareAccessLevelNoAll caseAccessLevel) {
      this.caseAccessLevel = caseAccessLevel;
      caseAccessLevel__is_set = true;
    }

    /**
     * element : contactAccessLevel of type {http://soap.sforce.com/2006/04/metadata}ShareAccessLevelNoAll
     * java type: com.sforce.soap.metadata.ShareAccessLevelNoAll
     */
    private static final com.sforce.ws.bind.TypeInfo contactAccessLevel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","contactAccessLevel","http://soap.sforce.com/2006/04/metadata","ShareAccessLevelNoAll",1,1,true);

    private boolean contactAccessLevel__is_set = false;

    private com.sforce.soap.metadata.ShareAccessLevelNoAll contactAccessLevel;

    public com.sforce.soap.metadata.ShareAccessLevelNoAll getContactAccessLevel() {
      return contactAccessLevel;
    }

    public void setContactAccessLevel(com.sforce.soap.metadata.ShareAccessLevelNoAll contactAccessLevel) {
      this.contactAccessLevel = contactAccessLevel;
      contactAccessLevel__is_set = true;
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
     * element : opportunityAccessLevel of type {http://soap.sforce.com/2006/04/metadata}ShareAccessLevelNoAll
     * java type: com.sforce.soap.metadata.ShareAccessLevelNoAll
     */
    private static final com.sforce.ws.bind.TypeInfo opportunityAccessLevel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","opportunityAccessLevel","http://soap.sforce.com/2006/04/metadata","ShareAccessLevelNoAll",1,1,true);

    private boolean opportunityAccessLevel__is_set = false;

    private com.sforce.soap.metadata.ShareAccessLevelNoAll opportunityAccessLevel;

    public com.sforce.soap.metadata.ShareAccessLevelNoAll getOpportunityAccessLevel() {
      return opportunityAccessLevel;
    }

    public void setOpportunityAccessLevel(com.sforce.soap.metadata.ShareAccessLevelNoAll opportunityAccessLevel) {
      this.opportunityAccessLevel = opportunityAccessLevel;
      opportunityAccessLevel__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "AccountTerritorySharingRule");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, accountAccessLevel__typeInfo, accountAccessLevel, accountAccessLevel__is_set);
       __typeMapper.writeObject(__out, caseAccessLevel__typeInfo, caseAccessLevel, caseAccessLevel__is_set);
       __typeMapper.writeObject(__out, contactAccessLevel__typeInfo, contactAccessLevel, contactAccessLevel__is_set);
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
       __typeMapper.writeObject(__out, opportunityAccessLevel__typeInfo, opportunityAccessLevel, opportunityAccessLevel__is_set);
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
        if (__typeMapper.verifyElement(__in, accountAccessLevel__typeInfo)) {
            setAccountAccessLevel((com.sforce.soap.metadata.ShareAccessLevelNoNone)__typeMapper.readObject(__in, accountAccessLevel__typeInfo, com.sforce.soap.metadata.ShareAccessLevelNoNone.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, caseAccessLevel__typeInfo)) {
            setCaseAccessLevel((com.sforce.soap.metadata.ShareAccessLevelNoAll)__typeMapper.readObject(__in, caseAccessLevel__typeInfo, com.sforce.soap.metadata.ShareAccessLevelNoAll.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, contactAccessLevel__typeInfo)) {
            setContactAccessLevel((com.sforce.soap.metadata.ShareAccessLevelNoAll)__typeMapper.readObject(__in, contactAccessLevel__typeInfo, com.sforce.soap.metadata.ShareAccessLevelNoAll.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, description__typeInfo)) {
            setDescription(__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, name__typeInfo)) {
            setName(__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, opportunityAccessLevel__typeInfo)) {
            setOpportunityAccessLevel((com.sforce.soap.metadata.ShareAccessLevelNoAll)__typeMapper.readObject(__in, opportunityAccessLevel__typeInfo, com.sforce.soap.metadata.ShareAccessLevelNoAll.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[AccountTerritorySharingRule ");
      sb.append(super.toString());sb.append(" accountAccessLevel='").append(com.sforce.ws.util.Verbose.toString(accountAccessLevel)).append("'\n");
      sb.append(" caseAccessLevel='").append(com.sforce.ws.util.Verbose.toString(caseAccessLevel)).append("'\n");
      sb.append(" contactAccessLevel='").append(com.sforce.ws.util.Verbose.toString(contactAccessLevel)).append("'\n");
      sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" name='").append(com.sforce.ws.util.Verbose.toString(name)).append("'\n");
      sb.append(" opportunityAccessLevel='").append(com.sforce.ws.util.Verbose.toString(opportunityAccessLevel)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}