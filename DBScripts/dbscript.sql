--------------------------------------------------------
--  File created - Tuesday-December-17-2013
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence ERROR_AUDIT_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "GOODTECH"."ERROR_AUDIT_SEQ"  MINVALUE 1000 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1720 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence ERROR_MASTER_ERROR_ID_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "GOODTECH"."ERROR_MASTER_ERROR_ID_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence ERROR_MASTER_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "GOODTECH"."ERROR_MASTER_SEQ"  MINVALUE 1000 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1020 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence HIBERNATE_SEQUENCE
--------------------------------------------------------

   CREATE SEQUENCE  "GOODTECH"."HIBERNATE_SEQUENCE"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence PO_CUSTOMER_DETAILS_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "GOODTECH"."PO_CUSTOMER_DETAILS_SEQ"  MINVALUE 1000 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1180 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence PO_DETAILS_PO_DETAILS_ID_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "GOODTECH"."PO_DETAILS_PO_DETAILS_ID_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence PO_DETAILS_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "GOODTECH"."PO_DETAILS_SEQ"  MINVALUE 1000 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1120 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence PO_ITEM_DETAILS_PO_ITEM_DE_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "GOODTECH"."PO_ITEM_DETAILS_PO_ITEM_DE_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999 INCREMENT BY 1 START WITH 281 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence PO_ITEM_DETAILS_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "GOODTECH"."PO_ITEM_DETAILS_SEQ"  MINVALUE 1000 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1000 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Table ERROR_AUDIT
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."ERROR_AUDIT"
   (	"ERROR_AUDIT_ID" NUMBER,
	"PO_NUMBER" VARCHAR2(100),
	"MESSAGE" VARCHAR2(2000),
	"CREATED_DATE" DATE DEFAULT SYSDATE,
	"FILE_NAME" VARCHAR2(100),
	"PO_DETAILS_ID" NUMBER,
	"ERROR_CODE" VARCHAR2(10),
	"JOB_ID" VARCHAR2(100),
	"ERROR_SOURCE" VARCHAR2(10),
	"PROCESSED_FLAG" VARCHAR2(1)
   ) ;
--------------------------------------------------------
--  DDL for Table ERROR_AUDIT_HISTORY
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."ERROR_AUDIT_HISTORY"
   (	"ERROR_AUDIT_ID" NUMBER,
	"PO_NUMBER" VARCHAR2(100),
	"MESSAGE" VARCHAR2(2000),
	"CREATED_DATE" DATE,
	"FILE_NAME" VARCHAR2(100),
	"PO_DETAILS_ID" NUMBER,
	"ERROR_CODE" VARCHAR2(10),
	"JOB_ID" VARCHAR2(100),
	"ERROR_SOURCE" VARCHAR2(10),
	"PROCESSED_FLAG" VARCHAR2(1)
   ) ;
--------------------------------------------------------
--  DDL for Table ERROR_LOG
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."ERROR_LOG"
   (	"PO_DETAILS_ID" NUMBER(38,0),
	"ERROR_ID" NUMBER(38,0),
	"CREATED_DATE" DATE
   ) ;
--------------------------------------------------------
--  DDL for Table ERROR_MASTER
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."ERROR_MASTER"
   (	"ERROR_ID" NUMBER(38,0),
	"ERROR_CODE" VARCHAR2(10 CHAR),
	"ERROR_MESSAGE" CLOB,
	"CREATED_DATE" DATE,
	"ERROR_TYPE" VARCHAR2(4)
   ) ;
--------------------------------------------------------
--  DDL for Table PO_CUSTOMER_DETAILS
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."PO_CUSTOMER_DETAILS"
   (	"PO_CUSTOMER_DETAILS_ID" NUMBER(38,0),
	"CUSTOMER_NUMBER" VARCHAR2(45 CHAR),
	"NAME" CLOB,
	"STREET" CLOB,
	"CITY" VARCHAR2(100 CHAR),
	"STATE" VARCHAR2(100 CHAR),
	"ZIP_CODE" VARCHAR2(45 CHAR),
	"CONTACT_NAME" VARCHAR2(100 CHAR),
	"CONTACT_EMAIL" VARCHAR2(100 CHAR),
	"PHONE" VARCHAR2(45 CHAR),
	"COUNTRY" VARCHAR2(45 CHAR),
	"COMMENT_" CLOB,
	"PO_DETAILS_ID" NUMBER(38,0),
	"CUSTOMER_TYPE" VARCHAR2(10)
   ) ;
--------------------------------------------------------
--  DDL for Table PO_CUSTOMER_DETAILS_HISTORY
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."PO_CUSTOMER_DETAILS_HISTORY"
   (	"PO_CUSTOMER_DETAILS_ID" NUMBER(38,0),
	"CUSTOMER_NUMBER" VARCHAR2(45 CHAR),
	"NAME" CLOB,
	"STREET" CLOB,
	"CITY" VARCHAR2(100 CHAR),
	"STATE" VARCHAR2(100 CHAR),
	"ZIP_CODE" VARCHAR2(45 CHAR),
	"CONTACT_NAME" VARCHAR2(100 CHAR),
	"CONTACT_EMAIL" VARCHAR2(100 CHAR),
	"PHONE" VARCHAR2(45 CHAR),
	"COUNTRY" VARCHAR2(45 CHAR),
	"COMMENT_" CLOB,
	"PO_DETAILS_ID" NUMBER(38,0),
	"CUSTOMER_TYPE" VARCHAR2(10)
   ) ;
--------------------------------------------------------
--  DDL for Table PO_DETAILS
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."PO_DETAILS"
   (
   "PO_DETAILS_ID" NUMBER(38,0),
	"PO_NUMBER" VARCHAR2(45 CHAR),
	"DISTRIBUTOR_ID" VARCHAR2(45 CHAR),
	"PAYMENT_TERMS" VARCHAR2(45 CHAR),
	"TOTAL_VALUE" NUMBER,
	"ORDER_DATE" DATE,
	"QUOTE_NUMBER" VARCHAR2(45 CHAR),
	"OPP_ID" VARCHAR2(45 CHAR),
	"ENDUSER_PO_NUMBER" VARCHAR2(45 CHAR),
	"CURRENCY" VARCHAR2(45 CHAR),
	"COMMENT_" CLOB,
	"PROCESSED_FLAG" VARCHAR2(2 CHAR) DEFAULT 'N',
	"CREATED_DATE" DATE DEFAULT sysdate,
	"QUOTE_EXISTS" VARCHAR2(1) DEFAULT 'N',
	"PO_FILE_NAME" VARCHAR2(100)
   ) ;
--------------------------------------------------------
--  DDL for Table PO_DETAILS_HISTORY
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."PO_DETAILS_HISTORY"
   (	"PO_DETAILS_ID" NUMBER(38,0),
	"PO_NUMBER" VARCHAR2(45 CHAR),
	"DISTRIBUTOR_ID" VARCHAR2(45 CHAR),
	"PAYMENT_TERMS" VARCHAR2(45 CHAR),
	"CONTRACT_NUMBER" VARCHAR2(45 CHAR),
	"TOTAL_VALUE" NUMBER,
	"ORDER_DATE" DATE,
	"QUOTE_NUMBER" VARCHAR2(45 CHAR),
	"OPP_ID" VARCHAR2(45 CHAR),
	"ENDUSER_PO_NUMBER" VARCHAR2(45 CHAR),
	"CURRENCY" VARCHAR2(45 CHAR),
	"COMMENT_" CLOB,
	"PROCESSED_FLAG" VARCHAR2(2 CHAR),
	"CREATED_DATE" DATE,
	"QUOTE_EXISTS" VARCHAR2(1),
	"SUPPORT_START_DATE" DATE,
	"SUPPORT_END_DATE" DATE,
	"PO_FILE_NAME" VARCHAR2(100)
   ) ;
--------------------------------------------------------
--  DDL for Table PO_ITEM_DETAILS
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."PO_ITEM_DETAILS"
   (	"PO_ITEM_DETAILS_ID" NUMBER(38,0),
	"PO_DETAILS_ID" NUMBER(38,0),
	"PRODUCT_CODE" VARCHAR2(100 CHAR),
	"PRODUCT_DESCRIPTION" CLOB,
	"DISTRIBUTOR_PRODUCT_CODE" VARCHAR2(100 CHAR),
	"TERM" VARCHAR2(45 CHAR),
	"VALUE" NUMBER(10,0),
	"LIST_PRICE" NUMBER,
	"SALES_PRICE" NUMBER,
	"EXTENDED_PRICE" NUMBER,
	"SERIAL_NUMBER" VARCHAR2(100 CHAR),
	"QUANTITY" NUMBER(38,0),
	"REQUESTED_DATE" DATE,
	"PO_FILE_NAME" VARCHAR2(100)
   ) ;
--------------------------------------------------------
--  DDL for Table PO_ITEM_DETAILS_HISTORY
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."PO_ITEM_DETAILS_HISTORY"
   (	"PO_ITEM_DETAILS_ID" NUMBER(38,0),
	"PO_DETAILS_ID" NUMBER(38,0),
	"PRODUCT_CODE" VARCHAR2(100 CHAR),
	"PRODUCT_DESCRIPTION" CLOB,
	"DISTRIBUTOR_PRODUCT_CODE" VARCHAR2(100 CHAR),
	"TERM" VARCHAR2(45 CHAR),
	"VALUE" NUMBER(10,0),
	"LIST_PRICE" NUMBER,
	"SALES_PRICE" NUMBER,
	"EXTENDED_PRICE" NUMBER,
	"SERIAL_NUMBER" VARCHAR2(100 CHAR),
	"QUANTITY" NUMBER(38,0),
	"REQUESTED_DATE" DATE,
	"PO_FILE_NAME" VARCHAR2(100)
   ) ;
--------------------------------------------------------
--  DDL for Table SFDC_QUOTE_DETAILS
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."SFDC_QUOTE_DETAILS"
   (	"QUOTE_ID" VARCHAR2(50 CHAR),
	"QUOTE_NUMBER" VARCHAR2(45 CHAR),
	"PRODUCT_CODE" VARCHAR2(45 CHAR),
	"PRODUCT_DESCRIPTION" CLOB,
	"LIST_PRICE" NUMBER,
	"SALES_PRICE" NUMBER,
	"EXTENDED_PRICE" NUMBER,
	"QUANTITY" NUMBER(38,0),
	"TERM" VARCHAR2(10 CHAR),
	"VALUE" NUMBER(10,0),
	"COMMENTS" CLOB,
	"SERIAL_NUMBER" VARCHAR2(45 CHAR),
	"BUNDLE_CHILD" VARCHAR2(1)
   ) ;
--------------------------------------------------------
--  DDL for Table STOCK
--------------------------------------------------------

  CREATE TABLE "GOODTECH"."STOCK"
   (	"STOCK_ID" NUMBER,
	"STOCK_CODE" VARCHAR2(10),
	"STOCK_NAME" VARCHAR2(20)
   ) ;
--------------------------------------------------------
--  DDL for View PO_DETAILS_SUMMARY
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "GOODTECH"."PO_DETAILS_SUMMARY" ("PO_DETAILS_ID", "QUOTE_NUMBER", "TOTAL_LINES", "TOTAL_VALUE") AS
  select a.po_details_id,quote_number, count(*) total_lines, total_value from po_details a, po_item_details b
where a.po_details_id = b.po_details_id
group by a.po_details_id,a.quotE_number,total_value;
--------------------------------------------------------
--  DDL for View SFDC_QUOTE_SUMMARY
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "GOODTECH"."SFDC_QUOTE_SUMMARY" ("QUOTE_ID", "QUOTE_NUMBER", "TOTAL_LINES", "TOTAL_PRICE") AS
  SELECT quote_id,
    quote_number,
    COUNT(*) total_lines,
    SUM (extended_price) total_price
  FROM sfdc_quote_Details
  where bundle_child='0'
  GROUP BY quote_id,
    quote_number;
--------------------------------------------------------
--  DDL for View XML_PO_SUMMARY
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "GOODTECH"."XML_PO_SUMMARY" ("QUOTE_NUMBER", "TOTAL_LINES", "TOTAL_VALUE") AS
  select quote_number, count(*) total_lines, total_value from po_details a, po_item_details b
where a.po_details_id = b.po_details_id
group by a.quotE_number,total_value;
--------------------------------------------------------
--  DDL for View po_details_summary
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "GOODTECH"."po_details_summary" ("po_details_id", "QUOTE_NUMBER", "TOTAL_LINES", "TOTAL_VALUE") AS
  select a.po_details_id,quote_number, count(*) total_lines, total_value from po_details a, po_item_details b
where a.po_details_id = b.po_details_id
group by a.po_details_id,a.quotE_number,total_value;
--------------------------------------------------------
--  DDL for Procedure ARCHIVE_PO_DETAILS
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "GOODTECH"."ARCHIVE_PO_DETAILS" AS
BEGIN
  insert into po_details_history select * from po_details;
  insert into po_customer_details_history select * from po_customer_details;
  insert into po_item_details_history  select  * from po_item_Details;
  insert into error_audit_history  select * from error_audit;

  delete from po_item_Details;
  delete from po_customer_details;
    delete from po_details;
  delete from error_audit;
END ARCHIVE_PO_DETAILS;

/
--------------------------------------------------------
--  DDL for Procedure VALIDATEXML
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "GOODTECH"."VALIDATEXML"
AS
BEGIN
    DECLARE
        rec_po_details      po_details%ROWTYPE;
        rec_po_item_details po_item_details%ROWTYPE;
        quoteexists         NUMBER;
        error_seq_val       NUMBER;
        error_message_str   VARCHAR2(2000);
        error_flag          VARCHAR2(1) := 'N';
        totalvalue          NUMBER;
        pototalvalue        NUMBER;
        variancevalue       NUMBER;
        itemCount number;
        groupMatch number;
        CURSOR c_po_details IS
          SELECT *
          FROM   po_details
          WHERE  processed_flag = 'N';
        CURSOR c_po_item_details(
          po_id NUMBER) IS
          SELECT *
          FROM   po_item_details
          WHERE  po_details_id = po_id;
    BEGIN
        FOR rec_po_details IN c_po_details LOOP
            error_flag := 'N';

            EXIT WHEN c_po_details%NOTFOUND;
            -- cursor attribute to exit when no rows found to fetch.

            /** IF Referenced quote exists**/
            SELECT count(*)
            INTO   quoteexists
            FROM   po_details a,
                   sfdc_quote_details b
            WHERE  a.quote_number = b.quote_number
                   AND a.po_details_id = rec_po_details.po_details_id;

            IF quoteexists < 1 THEN
              --     ERROR_FLAG        := 'Y';
              error_message_str := 'Referenced Quote does not exist or is not Approved in the system';

              INSERT INTO error_audit
              SELECT error_audit_seq.NEXTVAL,
                     rec_po_details.po_number,
                     error_message_str,
                     SYSDATE,
                     rec_po_details.po_file_name,
                     rec_po_details.po_details_id,
                     '900','','PLSQL','N'
              FROM   dual;
            ELSE
              UPDATE po_details
              SET    quote_exists = 'Y'
              WHERE  po_details_id = rec_po_details.po_details_id;
            END IF;

            IF quoteexists > 0 THEN
              -- Check total value of the PO and Quote
              dbms_output.Put_line('Quote exists checking for Total Value');

              SELECT total_price
              INTO   totalvalue
              FROM   sfdc_quote_summary
              WHERE  quote_number = rec_po_details.quote_number;

              SELECT total_value
              INTO   pototalvalue
              FROM   po_details
              WHERE  po_details_id = rec_po_details.po_details_id;

			  --get variance value to check if the PO Total value falls within the 2 percent variance
              variancevalue := 0.02 * totalvalue;

           dbms_output.Put_line('Variance value is ' || variancevalue);
           --   dbms_output.put_line('totalValue : ' || totalvalue - variancevalue || ',poTotalbValue:' || totalvalue + variancevalue || ',variance Value:' ||varianceValue);
 			 	if ((poTotalValue>=(totalValue-variancevalue)) AND (poTotalValue<=(totalValue+variancevalue))) then
				     dbms_output.put_line('PO Value matches within the 2% variance');
				  else
					error_flag := 'Y';
				     INSERT INTO error_audit
	                SELECT error_audit_seq.NEXTVAL,
	                       rec_po_details.po_number,
	                       'Total value does not match Quote',
	                       SYSDATE,
	                       rec_po_details.po_file_name,
	                       rec_po_details.po_details_id,
	                       '100' ,'','PLSQL','N'
	                FROM   dual;
              END IF;

              -- Check total lines
              dbms_output.Put_line('Check number of lines match');

              totalvalue := 0;

              pototalvalue := 0;

              SELECT total_lines
              INTO   totalvalue
              FROM   sfdc_quote_summary
              WHERE  quote_number = rec_po_details.quote_number;
              SELECT total_lines
              INTO   pototalvalue
              FROM   po_details_summary
              WHERE  po_details_id = rec_po_details.po_details_id;

              IF ( totalvalue <> pototalvalue ) THEN
                error_flag := 'Y';

                INSERT INTO error_audit
                SELECT error_audit_seq.NEXTVAL,
                       rec_po_details.po_number,
                       'Total number of lines does not match the quote',
                       SYSDATE,
                       rec_po_details.po_file_name,
                       rec_po_details.po_details_id,
                       '200' ,'','PLSQL','N'
                FROM   dual;
              END IF;
            END IF;

            FOR rec_po_item_details IN
            c_po_item_details(rec_po_details.po_details_id)
            LOOP
                IF quoteexists > 0 THEN
                  dbms_output.Put_line(''
                                       ||rec_po_item_details.product_code);
                --check for product code existance
                itemCount := 0;
                select count(*) into itemCount from sfdc_quote_details a, po_item_details b, po_details c
                where b.po_details_id = c.po_Details_id
                and a.quote_number = c.quote_number
                and a.product_code = b.product_code
                and c.po_details_id = rec_po_details.po_Details_id
                and b.po_item_details_id = rec_po_item_details.po_item_details_id;
                if itemCount = 0 then
                  error_flag := 'Y';
                INSERT INTO error_audit
                SELECT error_audit_seq.NEXTVAL,
                       rec_po_details.po_number,
                       rec_po_item_details.product_code || ' does not exist on the referenced quote',
                       SYSDATE,
                       rec_po_details.po_file_name,
                       rec_po_details.po_details_id,
                       '300' ,'','PLSQL','N'
                FROM   dual;
                end if;

                --check for group of attributes for multiple product occurances
                if (itemCount > 1) then
                  select count(*) into groupMatch from sfdc_quote_details a where
                  a.quote_number = rec_po_details.quote_number
                  and a.product_code = rec_po_item_details.product_code
                  and a.term = rec_po_item_Details.term
                  and a.value = rec_po_item_details.value
                  and a.quantity = rec_po_item_details.quantity
                  and a.sales_price = rec_po_item_details.sales_price;

                  if groupMatch < 1 then
                    INSERT INTO error_audit
                SELECT error_audit_seq.NEXTVAL,
                       rec_po_details.po_number,
                       rec_po_item_details.product_code || ' sales price does not match the referenced quote',
                       SYSDATE,
                       '',
                       rec_po_details.po_details_id,
                       '400' ,'','PLSQL','N'
                FROM   dual;
                  end if;
                end if;

                --check for the line sales price
                if itemCount = 1 then
                  totalVAlue :=0;
                  poTotalValue := 0;
                  select sales_price into totalValue from sfdc_quote_details where quote_number = rec_po_details.quote_number and product_code = rec_po_item_Details.product_code;
                  if(totalValue <> rec_po_item_details.sales_price) then
                   error_flag := 'Y';
                INSERT INTO error_audit
                SELECT error_audit_seq.NEXTVAL,
                       rec_po_details.po_number,
                       rec_po_item_details.product_code || ' sales price does not match the referenced quote',
                       SYSDATE,
                       rec_po_details.po_file_name,
                       rec_po_details.po_details_id,
                       '400' ,'','PLSQL','N'
                FROM   dual;
                  end if;
                end if;

				--check for the line term and value
                if itemCount = 1 then
                  totalVAlue :=0;
                  select count(*) into totalValue from sfdc_quote_details where quotE_number = rec_po_details.quote_number and product_code = rec_po_item_Details.product_code and term = rec_po_item_details.term and value = rec_po_item_Details.value;
                  if(not (totalValue > 0)) then
                   error_flag := 'Y';
                INSERT INTO error_audit
                SELECT error_audit_seq.NEXTVAL,
                       rec_po_details.po_number,
                       rec_po_item_details.product_code || ' term and value does not match the referenced quote',
                       SYSDATE,
                       rec_po_details.po_file_name,
                       rec_po_details.po_details_id,
                       '600' ,'','PLSQL','N'
                FROM   dual;
                  end if;
                end if;

                --check fo the line quantity
                if itemCount = 1 then
                  totalVAlue :=0;
                  poTotalValue := 0;
                  select quantity into totalValue from sfdc_quote_details where quote_number = rec_po_details.quote_number and product_code = rec_po_item_Details.product_code;
                  if(totalValue <> rec_po_item_details.quantity) then
                   error_flag := 'Y';
                INSERT INTO error_audit
                SELECT error_audit_seq.NEXTVAL,
                       rec_po_details.po_number,
                       rec_po_item_details.product_code || ' quantity does not match the referenced quote',
                       SYSDATE,
                       rec_po_details.po_file_name,
                       rec_po_details.po_details_id,
                       '700' ,'','PLSQL','N'
                FROM   dual;
                  end if;
                end if;
                --check for product code
                END IF;
            END LOOP;
        END LOOP;
    END;
END;

/

--5/14/2014 Added alter table scripts to accomodate TD NALA changes
alter table po_details add  ISA_control_number varchar2(4000);
alter table po_details add  receiver_id varchar2(4000);

alter table po_details_history add  ISA_control_number varchar2(4000);
alter table po_details_history add  receiver_id varchar2(4000);
