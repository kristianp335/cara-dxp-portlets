create index IX_413EA323 on Cara_project (groupId, status);
create index IX_29B6DC3A on Cara_project (projectCategory[$COLUMN_LENGTH:75$]);
create index IX_C9E0BF87 on Cara_project (projectName[$COLUMN_LENGTH:75$]);
create index IX_4C34FD76 on Cara_project (projectRefId[$COLUMN_LENGTH:75$]);
create index IX_D5716476 on Cara_project (projectType[$COLUMN_LENGTH:75$]);
create index IX_C77563F3 on Cara_project (status);
create index IX_84647AC1 on Cara_project (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_EA9EBD83 on Cara_project (uuid_[$COLUMN_LENGTH:75$], groupId);