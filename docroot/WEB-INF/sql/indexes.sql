create index IX_550E9DE3 on Author (uuid_);
create index IX_389CEA65 on Author (uuid_, companyId);
create unique index IX_C4B6C627 on Author (uuid_, groupId);

create index IX_3C3DA645 on Book (uuid_);
create index IX_CD3A30C3 on Book (uuid_, companyId);
create unique index IX_520E0C05 on Book (uuid_, groupId);