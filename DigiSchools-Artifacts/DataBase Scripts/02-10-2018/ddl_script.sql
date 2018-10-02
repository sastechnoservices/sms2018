CREATE TABLE dgs_schl(
	schl_id varchar(32), 
	schl_nm varchar(256), 
	schl_adrs varchar(256), 
	schl_cnt_dtl varchar(256), 
	schl_st varchar(2), 
	schl_crt_on timestamp, 
	schl_mod_on timestamp, 
	schl_mod_by varchar(32), 
	schl_logo_id varchar(32)
);

ALTER TABLE dgs_schl 
		ADD CONSTRAINT pk_dgs_schl PRIMARY KEY (schl_id);
		
CREATE TABLE dgs_prnt (
	prnt_id varchar(32),
	schl_id varchar(32),
	prnt_nm varchar(32),
	prnt_mob_no varchar(32),
	prnt_mail_id varchar(32),
	prnt_xml varchar(1024),
	prnt_crt_on timestamp,
	prnt_mod_on timestamp,
	prnt_mod_by varchar(32),
	prnt_img_id varchar(32)
);

ALTER TABLE dgs_prnt 
	ADD CONSTRAINT pk_dgs_prnt PRIMARY KEY (prnt_id),
	ADD CONSTRAINT fk_dgs_prnt_1 FOREIGN KEY (schl_id) REFERENCES dgs_schl(schl_id);
	
CREATE TABLE dgs_std (
	std_id varchar(32),
	schl_id varchar(32),
	prnt_id varchar(32),
	std_nm varchar(32),
	std_mob_no varchar(32),
	std_mail_id varchar(32),
	std_class_sec varchar(10),
	std_lst_subj varchar(1024),
	std_xml varchar(1024),
	std_crt_on timestamp,
	std_mod_on timestamp,
	std_mod_by varchar(32),
	std_status varchar(2),
	std_img_id varchar(32)
);

ALTER TABLE dgs_std
	ADD CONSTRAINT pk_dgs_std PRIMARY KEY (std_id),
	ADD CONSTRAINT fk_dgs_std_1 FOREIGN KEY (schl_id) REFERENCES dgs_schl(schl_id),
	ADD CONSTRAINT fk_dgs_std_2 FOREIGN KEY (prnt_id) REFERENCES dgs_prnt(prnt_id);
	
CREATE TABLE dgs_emp(
	emp_id varchar(32),
	schl_id varchar(32),
	emp_type varchar(5),
	emp_nm varchar(32),
	emp_mob_no varchar(32),
	emp_mail_id varchar(32),
	emp_lst_subj varchar(1024),
	emp_xml varchar(1024),
	emp_crt_on timestamp,
	emp_mod_on timestamp,
	emp_mod_by varchar(32),
	emp_img_id varchar(32)
);

ALTER TABLE dgs_emp
	ADD CONSTRAINT pk_dgs_emp PRIMARY KEY (emp_id),
	ADD CONSTRAINT fk_dgs_emp_1 FOREIGN KEY (schl_id) REFERENCES dgs_schl(schl_id);
	
CREATE TABLE dgs_subj(
	subj_id varchar(32),
	schl_id varchar(32),
	subj_type varchar(5),
	subj_desc varchar(32),
	subj_st varchar(2),
	subj_crt_on timestamp,
	subj_mod_on timestamp,
	subj_mod_by varchar(32)
);

ALTER TABLE dgs_subj
	ADD CONSTRAINT pk_dgs_subj PRIMARY KEY (subj_id),
	ADD CONSTRAINT fk_dgs_subj_1 FOREIGN KEY (schl_id) REFERENCES dgs_schl(schl_id);
	
CREATE TABLE dgs_class(
	class_id varchar(32),
	schl_id varchar(32),
	class_trd varchar(32),
	class_lst_cmp_subj varchar(1024),
	class_lst_opt_subj varchar(1024)
);

ALTER TABLE dgs_class
	ADD CONSTRAINT pk_dgs_class PRIMARY KEY (class_id),
	ADD CONSTRAINT fk_dgs_class_1 FOREIGN KEY (schl_id) REFERENCES dgs_schl(schl_id);