/**
 * SEAPersonServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface SEAPersonServiceSoap extends java.rmi.Remote {
    public void updatePerson(org.tempuri.PersonInfo objPersonInfo) throws java.rmi.RemoteException;
    public boolean checkDomainAccountWithPassword(java.lang.String domain, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public void updatePersonLeader(java.lang.String personCode, java.lang.String leaderCode) throws java.rmi.RemoteException;
    public org.tempuri.PersonInfo getPersonInfo(java.lang.String PK_Person) throws java.rmi.RemoteException;
    public org.tempuri.PersonInfo getPersonInfoByPsncode(java.lang.String psncode) throws java.rmi.RemoteException;
    public java.lang.String getPersonList() throws java.rmi.RemoteException;
    public void deletePerson(java.lang.String PK_PSNDOC) throws java.rmi.RemoteException;
    public void updateUser(org.tempuri.UserInfo objUserInfo) throws java.rmi.RemoteException;
    public org.tempuri.UserInfo getUserInfo(java.lang.String PK_User) throws java.rmi.RemoteException;
    public java.lang.String getUserList(java.lang.String keyword, int status) throws java.rmi.RemoteException;
    public void deleteUser(java.lang.String PK_User) throws java.rmi.RemoteException;
    public java.lang.String getPersonListByOrganize(java.lang.String PK_Organizations) throws java.rmi.RemoteException;
    public java.lang.String getPersonListByCorporation(java.lang.String PK_Corp, java.lang.String keyword) throws java.rmi.RemoteException;
    public java.lang.String getPersonListByDepartmentWithCascade(java.lang.String PK_Department) throws java.rmi.RemoteException;
    public java.lang.String search(java.lang.String personInfo, java.lang.String department, java.lang.String email, java.lang.String workLocation, java.lang.String workContent, java.lang.String officePhone) throws java.rmi.RemoteException;
    public java.lang.String quichSearch(java.lang.String keyword) throws java.rmi.RemoteException;
    public java.lang.String getPersonListByBirthday(java.lang.String startDate, java.lang.String endDate) throws java.rmi.RemoteException;
    public java.lang.String getPersonListByJobSeries(java.lang.String personInfo, java.lang.String department, java.lang.String email, java.lang.String workLocation, java.lang.String workContent, java.lang.String officePhone, java.lang.String jobSeries) throws java.rmi.RemoteException;
    public java.lang.String getJobSeriesList(java.lang.String keyword, java.lang.String parentJobSeries) throws java.rmi.RemoteException;
    public org.tempuri.PersonInfo loginByDomainAccount(java.lang.String accountName) throws java.rmi.RemoteException;
    public boolean checkPersonByDomainAccount(java.lang.String accountName) throws java.rmi.RemoteException;
    public org.tempuri.PersonInfo loginByDomainAccountWithPassword(java.lang.String domain, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public org.tempuri.PersonInfo loginByUserName(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String getPersonListByRole(java.lang.String PK_Role) throws java.rmi.RemoteException;
    public java.lang.String getRoleListByPerson(java.lang.String PK_Person) throws java.rmi.RemoteException;
    public java.lang.String getPermissionListByPerson(java.lang.String PK_Person) throws java.rmi.RemoteException;
    public void setReplacer(java.lang.String PK_Application, java.lang.String PSNCode, java.lang.String replacerCode) throws java.rmi.RemoteException;
    public org.tempuri.PersonInfo getReplacer(java.lang.String PK_Application, java.lang.String PSNCode) throws java.rmi.RemoteException;
    public void cancelReplacer(java.lang.String PK_Application, java.lang.String PSNCode) throws java.rmi.RemoteException;
    public boolean checkPersonByNameAndEmail(java.lang.String name, java.lang.String email) throws java.rmi.RemoteException;
    public java.lang.String checkPersonByUserName(java.lang.String userName) throws java.rmi.RemoteException;
    public java.lang.String checkPersonByUserNameAndType(java.lang.String userName, int type) throws java.rmi.RemoteException;
    public java.lang.String checkPersonByIDCard(java.lang.String ID) throws java.rmi.RemoteException;
    public java.lang.String checkPersonByIDCardAndType(java.lang.String ID, int type) throws java.rmi.RemoteException;
    public java.lang.String getPersonListByEmail(java.lang.String email, int personType) throws java.rmi.RemoteException;
    public java.lang.String getAuthorizerList(java.lang.String PK_Application, java.lang.String PSNCode) throws java.rmi.RemoteException;
    public java.lang.String getReplacerList(java.lang.String PK_Application, java.lang.String PSNCode) throws java.rmi.RemoteException;
    public org.tempuri.PersonInfo getDepartmentManager(java.lang.String PK_Dept) throws java.rmi.RemoteException;
    public java.lang.String getLeader(java.lang.String PSNCode) throws java.rmi.RemoteException;
    public java.lang.String getSubordinate(java.lang.String PSNCode) throws java.rmi.RemoteException;
    public void updateOrAdd_UN_Person(org.tempuri.UserInfo objUserInfo) throws java.rmi.RemoteException;
    public org.tempuri.PersonInfo loginByAllAccount(java.lang.String account, java.lang.String password) throws java.rmi.RemoteException;
    public int ISUpdatePassWordByAllAccount(java.lang.String account) throws java.rmi.RemoteException;
}
