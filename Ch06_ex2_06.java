/* Constructor practice
int d[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
if (monthOK(myMonth) && dateOK(monthString(myMonth), myDay, myYear)) {
    if (myYear % 400 == 0 || (myYear % 4 == 0 && myYear % 100 != 0) && myMonth == 2) {
        if (myDay < 0 && myDay > 29) {
            System.out.println("Fatal Error");
            System.exit(0);
        } else {
            setDate(monthString(myMonth), myDay, myYear);
        }
    } else if (myDay >= 1 && myDay <= d[myMonth - 1]) {
        setDate(monthString(myMonth), myDay, myYear);
    } else {
        System.out.println("Fatal Error");
        System.exit(0);
    }
} else {
    System.out.println("Fatal Error");
    System.exit(0);
}
*/