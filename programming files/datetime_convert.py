from datetime import datetime

# Date to convert
date_str = "2022-03-17 10:45:30"
# Converts the string into a datetime using datetime.strptime and stores it to date_obj
date_obj = datetime.strptime(date_str, '%Y-%m-%d %H:%M:%S')
# Saves the reformatted date to formatted date in the specified format
formatted_date = date_obj.strftime('%m/%d/%Y %H:%M:%S')

# Prints the new formatted date
print(formatted_date)
