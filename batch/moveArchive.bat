net use j: \\infa-db-prod.corp.good.com\share
copy j:\GoodTech\PurchaseOrder\prod\working\*.* j:\GoodTech\PurchaseOrder\prod\archive\
del /f /q  j:\GoodTech\PurchaseOrder\prod\working\
net use j: /delete /yes
