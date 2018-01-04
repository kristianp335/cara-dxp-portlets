create index IX_18514BA6 on cara_Tasks (jobId);
create index IX_B33955F6 on cara_Tasks (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3BEAE1F8 on cara_Tasks (uuid_[$COLUMN_LENGTH:75$], groupId);