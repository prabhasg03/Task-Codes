import datetime
x=datetime.datetime.now()
print(x)
print("Year:",x.year)
print("Day of Week:",x.strftime("%A"))
print("Day of Week(short):",x.strftime("%a"))
print("Day number of Week:",x.strftime("%w"))
print("Day of Month:",x.strftime("%d"))
print("Name of Month(short):",x.strftime("%b"))
print("Name of Month:",x.strftime("%B"))
print("Month number:",x.strftime("%m"))
print("Year(short 2000+):",x.strftime("%y"))
print("Year:",x.strftime("%Y"))
print("Hour(24):",x.strftime("%H"))
print("Hour:",x.strftime("%I"))
print("AM/PM:",x.strftime("%p"))
print("Minute:",x.strftime("%M"))
print("Seconds:",x.strftime("%S"))
print("Microsecond:",x.strftime("%f"))
print("UTC",x.strftime("%z"))
print("Timezone",x.strftime("%Z"))
print("Day of Year:",x.strftime("%j"))
print("Week no of year:",x.strftime("%U"))
print("Local date and time:",x.strftime("%c"))
print("Century:",x.strftime("%C"))
print("Local date:",x.strftime("%x"))
print("ISO 8601 Year:",x.strftime("%G"))
print("ISO 8601 weekday:",x.strftime("%u"))
print("ISO 8601 weeknumber:",x.strftime("%V"))
y=datetime.datetime(2020, 5, 17)
print(y)