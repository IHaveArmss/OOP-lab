# OOP Lab (Java)

This repository contains Java lab assignments organized by folder (`lab2` through `lab14`).

---

## How to Run a Lab

Open your terminal in the project root directory and run:

### Option 1: Using the Gradle Wrapper (Recommended)
```bash
./gradlew -- lab2
```
*(or without `--`: `./gradlew lab2`)*

### Option 2: Using the Shortcut Script
```bash
./run lab2
```
*(or `./run -- lab2`)*

---

## Running Other Labs

To run any other lab (from `lab2` to `lab14`), simply replace the lab number:

```bash
./gradlew -- lab3
./gradlew -- lab4
./gradlew -- lab14
```

---

## How It Works (Simplified)

You do **not** need to manually compile with `javac` or manage classpaths:
1. **Auto-Discovery**: Gradle looks inside the specified lab folder (e.g., `lab2/`) and finds whichever file contains `public static void main` (such as `Main.java` or `Client.java`).
2. **Auto-Compilation**: All `.java` files in that folder are compiled automatically.
3. **Interactive Terminal**: User input via `Scanner` / `System.in` is fully supported directly in the terminal.

---

## Passing Command-Line Arguments (Optional)

If your lab program expects arguments in `args[]`:
```bash
./gradlew lab2 --args="arg1 arg2"
```