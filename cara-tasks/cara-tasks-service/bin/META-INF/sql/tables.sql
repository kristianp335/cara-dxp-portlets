create table cara_Tasks (
	uuid_ VARCHAR(75) null,
	taskId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	jobId LONG,
	taskname VARCHAR(75) null,
	taskStatus LONG,
	completeDate DATE null,
	userAssigned LONG,
	superAssigned LONG
);