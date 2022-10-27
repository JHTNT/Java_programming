/* Method1
private static int compute(int pbnum) {
	int totalPrice = 0;
	totalPrice = pbnum * 500;
	return totalPrice;
}
*/

/* Method2
private static int compute(int pbnum, int cbnum) {
	int totalPrice = 0;
	totalPrice = pbnum * 500 + cbnum * 200;
	return totalPrice;
}
*/

/* Method3
private static int compute(int pbnum, int cbnum, int dbnum) {
	int totalPrice = 0;
	totalPrice = pbnum * 500 + cbnum * 200 + dbnum * 50;
	return totalPrice;
}
*/

/* Method4
private static int compute(String item, int num) {
	int totalPrice = 0;
	switch (item) {
		case "pb": totalPrice = num * 500;	break;
		case "pm": totalPrice = num * 400;	break;
		case "ps": totalPrice = num * 300;	break;
		case "cb": totalPrice = num * 200;	break;
		case "cs": totalPrice = num * 100;	break;
		case "db": totalPrice = num * 50;	break;
		case "ds": totalPrice = num * 30;	break;
	}
	return totalPrice;
}
*/

/* Method5
private static int compute(String... token) {
	int totalPrice = 0;
	int price = 0;
	for (int i = 0; i < token.length; i++) {
		switch (token[i]) {
			case "pm": price = 400;	break;
			case "pb": price = 500;	break;
			case "ps": price = 300;	break;
			case "cb": price = 200;	break;
			case "cs": price = 100;	break;
			case "db": price = 50;	break;
			case "ds": price = 30;	break;
		}
		i++;
		totalPrice += price * Integer.valueOf(token[i]);
	}
	return totalPrice;
}
*/