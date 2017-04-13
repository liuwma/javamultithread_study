/**
 * UserInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UserInfo  implements java.io.Serializable {
    private java.lang.String PK_User;

    private java.lang.String nickName;

    private java.lang.String username;

    private java.lang.String password;

    private java.lang.String question;

    private java.lang.String answer;

    private java.lang.String registEmail;

    private java.lang.String registNote;

    private java.util.Calendar registTime;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private int status;

    private boolean dr;

    private java.util.Calendar ts;

    private boolean DEF01;

    private int DEF02;

    private int DEF03;

    private java.util.Calendar DEF04;

    private java.util.Calendar DEF05;

    private java.lang.String DEF06;

    private java.lang.String DEF07;

    private java.lang.String DEF08;

    private java.lang.String DEF09;

    private java.lang.String DEF10;

    public UserInfo() {
    }

    public UserInfo(
           java.lang.String PK_User,
           java.lang.String nickName,
           java.lang.String username,
           java.lang.String password,
           java.lang.String question,
           java.lang.String answer,
           java.lang.String registEmail,
           java.lang.String registNote,
           java.util.Calendar registTime,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           int status,
           boolean dr,
           java.util.Calendar ts,
           boolean DEF01,
           int DEF02,
           int DEF03,
           java.util.Calendar DEF04,
           java.util.Calendar DEF05,
           java.lang.String DEF06,
           java.lang.String DEF07,
           java.lang.String DEF08,
           java.lang.String DEF09,
           java.lang.String DEF10) {
           this.PK_User = PK_User;
           this.nickName = nickName;
           this.username = username;
           this.password = password;
           this.question = question;
           this.answer = answer;
           this.registEmail = registEmail;
           this.registNote = registNote;
           this.registTime = registTime;
           this.startDate = startDate;
           this.endDate = endDate;
           this.status = status;
           this.dr = dr;
           this.ts = ts;
           this.DEF01 = DEF01;
           this.DEF02 = DEF02;
           this.DEF03 = DEF03;
           this.DEF04 = DEF04;
           this.DEF05 = DEF05;
           this.DEF06 = DEF06;
           this.DEF07 = DEF07;
           this.DEF08 = DEF08;
           this.DEF09 = DEF09;
           this.DEF10 = DEF10;
    }


    /**
     * Gets the PK_User value for this UserInfo.
     * 
     * @return PK_User
     */
    public java.lang.String getPK_User() {
        return PK_User;
    }


    /**
     * Sets the PK_User value for this UserInfo.
     * 
     * @param PK_User
     */
    public void setPK_User(java.lang.String PK_User) {
        this.PK_User = PK_User;
    }


    /**
     * Gets the nickName value for this UserInfo.
     * 
     * @return nickName
     */
    public java.lang.String getNickName() {
        return nickName;
    }


    /**
     * Sets the nickName value for this UserInfo.
     * 
     * @param nickName
     */
    public void setNickName(java.lang.String nickName) {
        this.nickName = nickName;
    }


    /**
     * Gets the username value for this UserInfo.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this UserInfo.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this UserInfo.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserInfo.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the question value for this UserInfo.
     * 
     * @return question
     */
    public java.lang.String getQuestion() {
        return question;
    }


    /**
     * Sets the question value for this UserInfo.
     * 
     * @param question
     */
    public void setQuestion(java.lang.String question) {
        this.question = question;
    }


    /**
     * Gets the answer value for this UserInfo.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this UserInfo.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }


    /**
     * Gets the registEmail value for this UserInfo.
     * 
     * @return registEmail
     */
    public java.lang.String getRegistEmail() {
        return registEmail;
    }


    /**
     * Sets the registEmail value for this UserInfo.
     * 
     * @param registEmail
     */
    public void setRegistEmail(java.lang.String registEmail) {
        this.registEmail = registEmail;
    }


    /**
     * Gets the registNote value for this UserInfo.
     * 
     * @return registNote
     */
    public java.lang.String getRegistNote() {
        return registNote;
    }


    /**
     * Sets the registNote value for this UserInfo.
     * 
     * @param registNote
     */
    public void setRegistNote(java.lang.String registNote) {
        this.registNote = registNote;
    }


    /**
     * Gets the registTime value for this UserInfo.
     * 
     * @return registTime
     */
    public java.util.Calendar getRegistTime() {
        return registTime;
    }


    /**
     * Sets the registTime value for this UserInfo.
     * 
     * @param registTime
     */
    public void setRegistTime(java.util.Calendar registTime) {
        this.registTime = registTime;
    }


    /**
     * Gets the startDate value for this UserInfo.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this UserInfo.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this UserInfo.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this UserInfo.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the status value for this UserInfo.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UserInfo.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the dr value for this UserInfo.
     * 
     * @return dr
     */
    public boolean isDr() {
        return dr;
    }


    /**
     * Sets the dr value for this UserInfo.
     * 
     * @param dr
     */
    public void setDr(boolean dr) {
        this.dr = dr;
    }


    /**
     * Gets the ts value for this UserInfo.
     * 
     * @return ts
     */
    public java.util.Calendar getTs() {
        return ts;
    }


    /**
     * Sets the ts value for this UserInfo.
     * 
     * @param ts
     */
    public void setTs(java.util.Calendar ts) {
        this.ts = ts;
    }


    /**
     * Gets the DEF01 value for this UserInfo.
     * 
     * @return DEF01
     */
    public boolean isDEF01() {
        return DEF01;
    }


    /**
     * Sets the DEF01 value for this UserInfo.
     * 
     * @param DEF01
     */
    public void setDEF01(boolean DEF01) {
        this.DEF01 = DEF01;
    }


    /**
     * Gets the DEF02 value for this UserInfo.
     * 
     * @return DEF02
     */
    public int getDEF02() {
        return DEF02;
    }


    /**
     * Sets the DEF02 value for this UserInfo.
     * 
     * @param DEF02
     */
    public void setDEF02(int DEF02) {
        this.DEF02 = DEF02;
    }


    /**
     * Gets the DEF03 value for this UserInfo.
     * 
     * @return DEF03
     */
    public int getDEF03() {
        return DEF03;
    }


    /**
     * Sets the DEF03 value for this UserInfo.
     * 
     * @param DEF03
     */
    public void setDEF03(int DEF03) {
        this.DEF03 = DEF03;
    }


    /**
     * Gets the DEF04 value for this UserInfo.
     * 
     * @return DEF04
     */
    public java.util.Calendar getDEF04() {
        return DEF04;
    }


    /**
     * Sets the DEF04 value for this UserInfo.
     * 
     * @param DEF04
     */
    public void setDEF04(java.util.Calendar DEF04) {
        this.DEF04 = DEF04;
    }


    /**
     * Gets the DEF05 value for this UserInfo.
     * 
     * @return DEF05
     */
    public java.util.Calendar getDEF05() {
        return DEF05;
    }


    /**
     * Sets the DEF05 value for this UserInfo.
     * 
     * @param DEF05
     */
    public void setDEF05(java.util.Calendar DEF05) {
        this.DEF05 = DEF05;
    }


    /**
     * Gets the DEF06 value for this UserInfo.
     * 
     * @return DEF06
     */
    public java.lang.String getDEF06() {
        return DEF06;
    }


    /**
     * Sets the DEF06 value for this UserInfo.
     * 
     * @param DEF06
     */
    public void setDEF06(java.lang.String DEF06) {
        this.DEF06 = DEF06;
    }


    /**
     * Gets the DEF07 value for this UserInfo.
     * 
     * @return DEF07
     */
    public java.lang.String getDEF07() {
        return DEF07;
    }


    /**
     * Sets the DEF07 value for this UserInfo.
     * 
     * @param DEF07
     */
    public void setDEF07(java.lang.String DEF07) {
        this.DEF07 = DEF07;
    }


    /**
     * Gets the DEF08 value for this UserInfo.
     * 
     * @return DEF08
     */
    public java.lang.String getDEF08() {
        return DEF08;
    }


    /**
     * Sets the DEF08 value for this UserInfo.
     * 
     * @param DEF08
     */
    public void setDEF08(java.lang.String DEF08) {
        this.DEF08 = DEF08;
    }


    /**
     * Gets the DEF09 value for this UserInfo.
     * 
     * @return DEF09
     */
    public java.lang.String getDEF09() {
        return DEF09;
    }


    /**
     * Sets the DEF09 value for this UserInfo.
     * 
     * @param DEF09
     */
    public void setDEF09(java.lang.String DEF09) {
        this.DEF09 = DEF09;
    }


    /**
     * Gets the DEF10 value for this UserInfo.
     * 
     * @return DEF10
     */
    public java.lang.String getDEF10() {
        return DEF10;
    }


    /**
     * Sets the DEF10 value for this UserInfo.
     * 
     * @param DEF10
     */
    public void setDEF10(java.lang.String DEF10) {
        this.DEF10 = DEF10;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserInfo)) return false;
        UserInfo other = (UserInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PK_User==null && other.getPK_User()==null) || 
             (this.PK_User!=null &&
              this.PK_User.equals(other.getPK_User()))) &&
            ((this.nickName==null && other.getNickName()==null) || 
             (this.nickName!=null &&
              this.nickName.equals(other.getNickName()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.question==null && other.getQuestion()==null) || 
             (this.question!=null &&
              this.question.equals(other.getQuestion()))) &&
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer()))) &&
            ((this.registEmail==null && other.getRegistEmail()==null) || 
             (this.registEmail!=null &&
              this.registEmail.equals(other.getRegistEmail()))) &&
            ((this.registNote==null && other.getRegistNote()==null) || 
             (this.registNote!=null &&
              this.registNote.equals(other.getRegistNote()))) &&
            ((this.registTime==null && other.getRegistTime()==null) || 
             (this.registTime!=null &&
              this.registTime.equals(other.getRegistTime()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            this.status == other.getStatus() &&
            this.dr == other.isDr() &&
            ((this.ts==null && other.getTs()==null) || 
             (this.ts!=null &&
              this.ts.equals(other.getTs()))) &&
            this.DEF01 == other.isDEF01() &&
            this.DEF02 == other.getDEF02() &&
            this.DEF03 == other.getDEF03() &&
            ((this.DEF04==null && other.getDEF04()==null) || 
             (this.DEF04!=null &&
              this.DEF04.equals(other.getDEF04()))) &&
            ((this.DEF05==null && other.getDEF05()==null) || 
             (this.DEF05!=null &&
              this.DEF05.equals(other.getDEF05()))) &&
            ((this.DEF06==null && other.getDEF06()==null) || 
             (this.DEF06!=null &&
              this.DEF06.equals(other.getDEF06()))) &&
            ((this.DEF07==null && other.getDEF07()==null) || 
             (this.DEF07!=null &&
              this.DEF07.equals(other.getDEF07()))) &&
            ((this.DEF08==null && other.getDEF08()==null) || 
             (this.DEF08!=null &&
              this.DEF08.equals(other.getDEF08()))) &&
            ((this.DEF09==null && other.getDEF09()==null) || 
             (this.DEF09!=null &&
              this.DEF09.equals(other.getDEF09()))) &&
            ((this.DEF10==null && other.getDEF10()==null) || 
             (this.DEF10!=null &&
              this.DEF10.equals(other.getDEF10())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPK_User() != null) {
            _hashCode += getPK_User().hashCode();
        }
        if (getNickName() != null) {
            _hashCode += getNickName().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getQuestion() != null) {
            _hashCode += getQuestion().hashCode();
        }
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        if (getRegistEmail() != null) {
            _hashCode += getRegistEmail().hashCode();
        }
        if (getRegistNote() != null) {
            _hashCode += getRegistNote().hashCode();
        }
        if (getRegistTime() != null) {
            _hashCode += getRegistTime().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        _hashCode += getStatus();
        _hashCode += (isDr() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTs() != null) {
            _hashCode += getTs().hashCode();
        }
        _hashCode += (isDEF01() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getDEF02();
        _hashCode += getDEF03();
        if (getDEF04() != null) {
            _hashCode += getDEF04().hashCode();
        }
        if (getDEF05() != null) {
            _hashCode += getDEF05().hashCode();
        }
        if (getDEF06() != null) {
            _hashCode += getDEF06().hashCode();
        }
        if (getDEF07() != null) {
            _hashCode += getDEF07().hashCode();
        }
        if (getDEF08() != null) {
            _hashCode += getDEF08().hashCode();
        }
        if (getDEF09() != null) {
            _hashCode += getDEF09().hashCode();
        }
        if (getDEF10() != null) {
            _hashCode += getDEF10().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "UserInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PK_User");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PK_User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NickName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Question"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Answer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegistEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegistNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegistTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEF01");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEF01"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEF02");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEF02"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEF03");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEF03"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEF04");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEF04"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEF05");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEF05"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEF06");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEF06"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEF07");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEF07"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEF08");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEF08"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEF09");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEF09"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEF10");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEF10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
