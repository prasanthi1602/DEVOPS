# Personal Expense Tracker — Java, Maven and Jenkins

## Requirements
- JDK 21 or later (Java 25 is suitable)
- Apache Maven
- Jenkins for automated builds

## Run locally
Open PowerShell in this project folder and run:
```powershell
mvn clean test
mvn package
java -cp target\classes com.example.expensetracker.App
```
Expected total: `Rs. 700.0`.

## Jenkins setup
1. In Jenkins, click **New Item**.
2. Enter `ExpenseTracker-CI`, select **Freestyle project**, and click **OK**.
3. Under **Build Steps**, select **Execute Windows batch command**.
4. Use the following commands (change the path if you extract the project elsewhere):
```bat
cd /d D:\ExpenseTracker
mvn clean test
```
5. Click **Save**, then **Build Now**. Open the build number and select **Console Output**.

If Jenkins says `mvn` is not recognized, configure Maven in Jenkins or add Maven's `bin` folder to the system PATH, then restart the Jenkins service.

## Files
- `pom.xml`: Maven configuration and JUnit dependency
- `Expense.java`: an expense record
- `ExpenseTracker.java`: stores expenses and calculates totals
- `App.java`: sample application
- `ExpenseTrackerTest.java`: four unit tests
