package bankExercise;
package bankExercise;
import java.awt.Frame;

import javax.swing.JFrame;

import bankexercise.Frames;
import net.miginfocom.swing.MigLayout;

public class BankApplication extends JFrame {
	
Frame createFrames;
	

	public BankApplication() {
		createFrames = new Frames();
		createFrames.setVisible(true);
	}
	
	public static void main(String[] args) {
		new BankApplication();
		
	}

	
	
}




/*
The task for your second assignment is to construct a system that will allow users to define a data structure representing a collection of records that can be displayed both by means of a dialog that can be scrolled through and by means of a table to give an overall view of the collection contents. 
The user should be able to carry out tasks such as adding records to the collection, modifying the contents of records, and deleting records from the collection, as well as being able to save and retrieve the contents of the collection to and from external random access files.
The records in the collection will represent bank account records with the following fields:

AccountID (this will be an integer unique to a particular account and 
will be automatically generated when a new account record is created)

AccountNumber (this will be a string of eight digits and should also 
be unique - you will need to check for this when creating a new record)

Surname (this will be a string of length 20)

FirstName (this will be a string of length 20)

AccountType (this will have two possible options - "Current " and 
"Deposit" - and again will be selected from a drop down list when 
entering a record)

Balance (this will a real number which will be initialised to 0.0 
and can be increased or decreased by means of transactions)

Overdraft (this will be a real number which will be initialised 
to 0.0 but can be updated by means of a dialog - it only applies 
to current accounts)

You may consider whether you might need more than one class to deal with bank accounts.
The system should be menu-driven, with the following menu options:

Navigate: First, Last, Next, Previous, Find By Account Number 
(allows you to find a record by account number entered via a 
dialog box), Find By Surname (allows you to find a record by 
surname entered via a dialog box),List All (displays the 
contents of the collection as a dialog containing a JTable)

Records: Create, Modify, Delete, Set Overdraft (this should 
use a dialog to allow you to set or update the overdraft for 
a current account), Set Interest Rate (this should allow you 
to set the interest rate for deposit accounts by means of a 
dialog)

Transactions: Deposit, Withdraw (these should use dialogs which
allow you to specify an account number and the amount to withdraw
or deposit, and should check that a withdrawal would not cause
the overdraft limit for a current account to be exceeded, or be 
greater than the balance in a deposit account, before the balance 
is updated), Calculate Interest (this calculates the interest rate 
for all deposit accounts and updates the balances)

File: Open, Save, Save As (these should use JFileChooser dialogs. 
The random access file should be able to hold 25 records. The position 
in which a record is stored and retrieved will be determined by its account 
number by means of a hashing procedure, with a standard method being used when 
dealing with possible hash collisions)

Exit Application (this should make sure that the collection is saved - or that 
the user is given the opportunity to save the collection - before the application closes)

When presenting the results in a JTable for the List All option, the records should be sortable on all fields, but not editable (changing the records or adding and deleting records can only be done through the main dialog).
For all menu options in your program, you should perform whatever validation, error-checking and exception-handling you consider to be necessary.
The programs Person.java and PersonApplication.java (from OOSD2) and TableDemo.java may be of use to you in constructing your interfaces. The set of Java programs used to create, edit and modify random access files will also provide you with a basis for your submission.

*/