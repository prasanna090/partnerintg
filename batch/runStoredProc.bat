net use j: \\infa-db-prod.corp.good.com\share
sqlplus goodtech/goodtech@GOODINTG @c:\goodtech\batch\ARCHIVE_PO_DETAILS.sql
java -cp c:\GoodTech\batch\partnerIntg.jar partnerIntg.App >> c:\GoodTech\batch\errors\javaRun.logs
sqlplus goodtech/goodtech@GOODINTG @c:\goodtech\batch\validateXML.sql
net use j: /delete /yes
