net use j: \\infa-db-prod.corp.good.com\share
net use k: \\MFT-TRADER\\"Tech Data PROD"
move /y k:\*.xml j:\GoodTech\PurchaseOrder\Prod\working\
ncftpget -f  c:\GoodTech\batch\ftpconfig.cfg -DD j:\GoodTech\PurchaseOrder\prod\working\ /out/TD*.xml
if %errorlevel% neq 0 echo "%errorlevel%:could not connect to ftp server, please check credentials or contact IT Support"
sqlplus goodtech/goodtech@GOODINTG @c:\goodtech\batch\ARCHIVE_PO_DETAILS.sql
net use j: /delete /yes