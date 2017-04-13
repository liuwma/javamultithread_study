package org.tempuri;

public class SEAPersonServiceSoapProxy implements org.tempuri.SEAPersonServiceSoap {
  private String _endpoint = null;
  private org.tempuri.SEAPersonServiceSoap sEAPersonServiceSoap = null;
  
  public SEAPersonServiceSoapProxy() {
    _initSEAPersonServiceSoapProxy();
  }
  
  public SEAPersonServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSEAPersonServiceSoapProxy();
  }
  
  private void _initSEAPersonServiceSoapProxy() {
    try {
      sEAPersonServiceSoap = (new org.tempuri.SEAPersonServiceLocator()).getSEAPersonServiceSoap();
      if (sEAPersonServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sEAPersonServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sEAPersonServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sEAPersonServiceSoap != null)
      ((javax.xml.rpc.Stub)sEAPersonServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.SEAPersonServiceSoap getSEAPersonServiceSoap() {
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap;
  }
  
  public void updatePerson(org.tempuri.PersonInfo objPersonInfo) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    sEAPersonServiceSoap.updatePerson(objPersonInfo);
  }
  
  public boolean checkDomainAccountWithPassword(java.lang.String domain, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.checkDomainAccountWithPassword(domain, userName, password);
  }
  
  public void updatePersonLeader(java.lang.String personCode, java.lang.String leaderCode) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    sEAPersonServiceSoap.updatePersonLeader(personCode, leaderCode);
  }
  
  public org.tempuri.PersonInfo getPersonInfo(java.lang.String PK_Person) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getPersonInfo(PK_Person);
  }
  
  public org.tempuri.PersonInfo getPersonInfoByPsncode(java.lang.String psncode) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getPersonInfoByPsncode(psncode);
  }
  
  public java.lang.String getPersonList() throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getPersonList();
  }
  
  public void deletePerson(java.lang.String PK_PSNDOC) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    sEAPersonServiceSoap.deletePerson(PK_PSNDOC);
  }
  
  public void updateUser(org.tempuri.UserInfo objUserInfo) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    sEAPersonServiceSoap.updateUser(objUserInfo);
  }
  
  public org.tempuri.UserInfo getUserInfo(java.lang.String PK_User) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getUserInfo(PK_User);
  }
  
  public java.lang.String getUserList(java.lang.String keyword, int status) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getUserList(keyword, status);
  }
  
  public void deleteUser(java.lang.String PK_User) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    sEAPersonServiceSoap.deleteUser(PK_User);
  }
  
  public java.lang.String getPersonListByOrganize(java.lang.String PK_Organizations) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getPersonListByOrganize(PK_Organizations);
  }
  
  public java.lang.String getPersonListByCorporation(java.lang.String PK_Corp, java.lang.String keyword) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getPersonListByCorporation(PK_Corp, keyword);
  }
  
  public java.lang.String getPersonListByDepartmentWithCascade(java.lang.String PK_Department) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getPersonListByDepartmentWithCascade(PK_Department);
  }
  
  public java.lang.String search(java.lang.String personInfo, java.lang.String department, java.lang.String email, java.lang.String workLocation, java.lang.String workContent, java.lang.String officePhone) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.search(personInfo, department, email, workLocation, workContent, officePhone);
  }
  
  public java.lang.String quichSearch(java.lang.String keyword) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.quichSearch(keyword);
  }
  
  public java.lang.String getPersonListByBirthday(java.lang.String startDate, java.lang.String endDate) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getPersonListByBirthday(startDate, endDate);
  }
  
  public java.lang.String getPersonListByJobSeries(java.lang.String personInfo, java.lang.String department, java.lang.String email, java.lang.String workLocation, java.lang.String workContent, java.lang.String officePhone, java.lang.String jobSeries) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getPersonListByJobSeries(personInfo, department, email, workLocation, workContent, officePhone, jobSeries);
  }
  
  public java.lang.String getJobSeriesList(java.lang.String keyword, java.lang.String parentJobSeries) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getJobSeriesList(keyword, parentJobSeries);
  }
  
  public org.tempuri.PersonInfo loginByDomainAccount(java.lang.String accountName) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.loginByDomainAccount(accountName);
  }
  
  public boolean checkPersonByDomainAccount(java.lang.String accountName) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.checkPersonByDomainAccount(accountName);
  }
  
  public org.tempuri.PersonInfo loginByDomainAccountWithPassword(java.lang.String domain, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.loginByDomainAccountWithPassword(domain, userName, password);
  }
  
  public org.tempuri.PersonInfo loginByUserName(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.loginByUserName(userName, password);
  }
  
  public java.lang.String getPersonListByRole(java.lang.String PK_Role) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getPersonListByRole(PK_Role);
  }
  
  public java.lang.String getRoleListByPerson(java.lang.String PK_Person) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getRoleListByPerson(PK_Person);
  }
  
  public java.lang.String getPermissionListByPerson(java.lang.String PK_Person) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getPermissionListByPerson(PK_Person);
  }
  
  public void setReplacer(java.lang.String PK_Application, java.lang.String PSNCode, java.lang.String replacerCode) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    sEAPersonServiceSoap.setReplacer(PK_Application, PSNCode, replacerCode);
  }
  
  public org.tempuri.PersonInfo getReplacer(java.lang.String PK_Application, java.lang.String PSNCode) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getReplacer(PK_Application, PSNCode);
  }
  
  public void cancelReplacer(java.lang.String PK_Application, java.lang.String PSNCode) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    sEAPersonServiceSoap.cancelReplacer(PK_Application, PSNCode);
  }
  
  public boolean checkPersonByNameAndEmail(java.lang.String name, java.lang.String email) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.checkPersonByNameAndEmail(name, email);
  }
  
  public java.lang.String checkPersonByUserName(java.lang.String userName) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.checkPersonByUserName(userName);
  }
  
  public java.lang.String checkPersonByUserNameAndType(java.lang.String userName, int type) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.checkPersonByUserNameAndType(userName, type);
  }
  
  public java.lang.String checkPersonByIDCard(java.lang.String ID) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.checkPersonByIDCard(ID);
  }
  
  public java.lang.String checkPersonByIDCardAndType(java.lang.String ID, int type) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.checkPersonByIDCardAndType(ID, type);
  }
  
  public java.lang.String getPersonListByEmail(java.lang.String email, int personType) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getPersonListByEmail(email, personType);
  }
  
  public java.lang.String getAuthorizerList(java.lang.String PK_Application, java.lang.String PSNCode) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getAuthorizerList(PK_Application, PSNCode);
  }
  
  public java.lang.String getReplacerList(java.lang.String PK_Application, java.lang.String PSNCode) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getReplacerList(PK_Application, PSNCode);
  }
  
  public org.tempuri.PersonInfo getDepartmentManager(java.lang.String PK_Dept) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getDepartmentManager(PK_Dept);
  }
  
  public java.lang.String getLeader(java.lang.String PSNCode) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getLeader(PSNCode);
  }
  
  public java.lang.String getSubordinate(java.lang.String PSNCode) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.getSubordinate(PSNCode);
  }
  
  public void updateOrAdd_UN_Person(org.tempuri.UserInfo objUserInfo) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    sEAPersonServiceSoap.updateOrAdd_UN_Person(objUserInfo);
  }
  
  public org.tempuri.PersonInfo loginByAllAccount(java.lang.String account, java.lang.String password) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.loginByAllAccount(account, password);
  }
  
  public int ISUpdatePassWordByAllAccount(java.lang.String account) throws java.rmi.RemoteException{
    if (sEAPersonServiceSoap == null)
      _initSEAPersonServiceSoapProxy();
    return sEAPersonServiceSoap.ISUpdatePassWordByAllAccount(account);
  }
  
  
}