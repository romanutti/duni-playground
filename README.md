# Reading List

---

## Setup

If your setup already has some of the required tools installed, please adjust accordingly.

1. Install Node 12.14.1 from here https://nodejs.org/en/blog/release/v12.14.1/
2. Run `npm install -g npm@7.23.0`
3. Run `npm install -g @angular/cli@12.2.4`
4. Verify your versions with `ng version`:  
   Angular CLI: **12.2.4**  
   Node: **12.14.1**  
   Package Manager: **npm 7.23.0**
4. Install a new version of IntelliJ
5. Clone the master branch with `git clone https://github.com/romanutti/duni-playground.git`
6. Open the project with IntelliJ and let gradle build the project
7. Install the npm dependencies with `cd frontend` followed by `npm install`


## Run

### Start backend

```
./gradlew bootRun
```

### Start frontend

```
cd frontend
npm start
```
