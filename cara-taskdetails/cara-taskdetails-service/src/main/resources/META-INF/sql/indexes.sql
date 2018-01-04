create index IX_F1BFD977 on Cara_TaskDetails (jobId);
create index IX_6928AB85 on Cara_TaskDetails (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1804F47 on Cara_TaskDetails (uuid_[$COLUMN_LENGTH:75$], groupId);