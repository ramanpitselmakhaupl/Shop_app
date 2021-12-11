# Shop_app
Another exam proect

Public class produkt contains a private variable String name that stores the name of the product, a private variable Double prise that stores the price of the product, a private variable boolean inBox that shows whether the product is in the cart.
public void setInBox (boolean isInBox) - sets the value of the inBox variable to true or false.
The boolean method returns the inBox variable. The double method returns the variable prise. public product (String name, Double prise) - constructor.
public string toString () - displays the values ​​of all product variables.
public class klient contains a private variable Double toPayment that shows how much the product costs.
The public method Double returns the toPayment variable.
public void addToBox (produkt k) - adds the transferred product to the cart, changes its value to true and increases the toPayment field by the product price.
public void delFromBox (produkt k) - removes the transferred product from the cart, changes its value to false and decreases the toPayment field by the product price.
Three products are created in the menu (p1, p2, p3), a menu with five options is displayed: 1 - shows products, 2 - adds to the cart, 3 - removes from the cart, 4 - shows the cart, 5 - completes purchases.
