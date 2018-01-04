create index IX_22AD50FF on Jobs_Jobs (projectId);
create index IX_6C936D59 on Jobs_Jobs (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E699761B on Jobs_Jobs (uuid_[$COLUMN_LENGTH:75$], groupId);