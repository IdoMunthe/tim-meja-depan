# Print-shop order desk: Hands-on 3 team template

Session 3 team project in plain Java: no Spring, no HTTP, no database, no tests. Three people, one Git repository, one branch per person, pull requests to bring the work together.

The project already compiles. Every method you still have to write throws `UnsupportedOperationException("TODO ...")`, and the message tells you who owns it and what it must do. Run any `main()` and the first TODO you hit tells you where to start.

## Who owns what

| Person | Package | Files | Branch |
|---|---|---|---|
| A | `product` | `PrintProduct`, `Discountable`, `ProductCatalog`, `ProductDemo`, and new classes `BusinessCard`, `Poster`, `Banner` | `feature/person-a-products` |
| B | `order` | `OrderLine`, `ParsedLine`, `Order`, `OrderLineParser`, `OrderDemo` | `feature/person-b-orders` |
| C | `report` | `OrderBook`, `ReportService`, `ReportDemo` | `feature/person-c-reports` |
| Together | `app` | `OrderDesk` (Part 2, after the three PRs are merged) | `feature/order-desk` |

`common` (`Finishing`, `OrderStatus`) and every class and method signature are already there: that is the team contract. Do not rename or change a signature without telling your team, because the others are coding against it.

Person B: the records `OrderLine`, `ParsedLine` and `Order` exist so Person C can use them from the first minute. Your job is to add the compact constructors (defensive copies) and fill in the methods.

## Git workflow

### 1. Once per person: clone

```bash
git clone <repository-url>
cd print-shop-team
```

Open the folder in IntelliJ (File → Open → select `pom.xml` → Open as Project).

### 2. Start your own branch

```bash
git checkout -b feature/person-a-products
```

### 3. Work, and commit small steps

```bash
git status
git add src/main/java/com/printing/shop/product
git commit -m "Person A: PrintProduct.price with finishing and discount"
```

Commit every time something works. A good message says what changed, not "update" or "fix".

### 4. Push and open a pull request

```bash
git push -u origin feature/person-a-products
```

Open the link Git prints (or go to the repository page) and create a pull request into `main`. GitLab calls it a merge request. Fill in the checklist.

### 5. Review and merge

A teammate reads the PR, leaves comments, and approves. Then merge it into `main`.

### 6. Get the latest main

```bash
git checkout main
git pull
```

Do this after every merge, and before you start Part 2.

### Merge conflict?

Git stops and marks the file:

```
<<<<<<< HEAD
your version
=======
the other version
>>>>>>> main
```

Decide together what the line must be, delete the markers, then `git add` the file and `git commit`. IntelliJ helps: Git → Resolve Conflicts. Conflicts are rare here when everyone stays in their own package.

## Run it

- In IntelliJ: right-click a class with `main()` → Run. For `OrderDesk`, the working directory must be the project root so `data/orders.csv` is found.
- From the terminal:

```bash
mvn -q compile
java -cp target/classes com.printing.shop.app.OrderDesk
```

The expected output is on the slide "The input files and the expected result".
