public class Time implements Comparable {
private int hour;
private int minute;
public Time() {
this(12, 0);
}
public Time(int h, int m) {
hour = 0;
minute = 0;
if (h >= 1 && h <= 24)
hour = h;
if (m >= 0 && m <= 60)
minute = m;
}
public int compareTo(Object o) {
Time t = (Time) o;
if (hour == t.hour && minute == t.minute)
return 0;
if (hour < t.hour)
return -1;
if (hour > t.hour)
return 1;
if (minute < t.minute)
return -1;
return 1;
}
public String difference(Time t) {
String s = "Time difference: ";
int total1 = hour * 60 + minute;
int total2 = t.hour * 60 + t.minute;
int diff = Math.abs(total1 - total2);
int hours = (diff / 60);
int minutes = (diff % 60);
if (hours < 10)
s += "0";
s += hours + ":";
if (minutes < 10)
s += "0";
s += minutes;
return s;
}

void increment(){
minute++;
hour = hour + minute / 60;
minute %= 60;
hour %= 24;
}
public String convert() {
String a = " PM";
if (hour < 13 || (hour == 12 && minute > 0))
a = " am";
int ho = hour % 12;
if (ho == 0)
ho = 12;
String mi = "";
if (minute < 10)
mi += "0";
mi += minute;
return "" + ho + ":" + mi + a;
}
public String toString() {
String h = "";
String m = "";
if (hour < 10)
h += "0";
if (minute < 10)
m += "0";
h += hour;
m += minute;
return "" + h + "" + m;
}
}