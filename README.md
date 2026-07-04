# backend-bootcamp

# Git Workflow Guidelines

## Branching Strategy

> **Important:** Everyone **must create their own branch** and work only on that branch.

Direct pushes or merges to the **master/main** branch are **blocked**. All changes must be made in your feature branch and submitted through a Pull Request (PR).

---

## Branch Naming Convention

Please follow one of the following naming conventions:

- `feature/yourname-topicname`
- `yourname-topicname`

### Examples

```text
feature/KAPaul-collections
feature/John-login-page
feature/Alice-exception-handling
```

---

## Step 1: Clone the Repository

Clone the repository to your local machine.

```bash
git clone <repository-url>
```

Move into the project directory.

```bash
cd <repository-folder>
```

---

## Step 2: Make Sure You Have the Latest Changes

Switch to the main branch.

```bash
git checkout main
```

Pull the latest changes.

```bash
git pull origin main
```

---

## Step 3: Create Your Feature Branch

Create your own branch.

```bash
git checkout -b feature/yourname-topicname
```

Example:

```bash
git checkout -b feature/KAPaul-collections
```

---

## Step 4: Verify Your Current Branch

Make sure you are working on your branch.

```bash
git branch
```

The active branch will be marked with `*`.

---

## Step 5: Make Your Changes

Implement your changes and save your work.

---

## Step 6: Check Your Changes

View the modified files.

```bash
git status
```

To see the actual code changes:

```bash
git diff
```

---

## Step 7: Add Changes to the Staging Area

Stage all modified files.

```bash
git add .
```

Or stage a specific file.

```bash
git add <filename>
```

---

## Step 8: Commit Your Changes

Commit your changes with a meaningful message.

```bash
git commit -m "Added Collections examples"
```

Examples:

```text
Added Collections examples
Implemented Student CRUD operations
Fixed NullPointerException in EmployeeService
```

---

## Step 9: Push Your Branch

Push your feature branch to GitHub.

```bash
git push -u origin feature/yourname-topicname
```

Example:

```bash
git push -u origin feature/KAPaul-collections
```

The `-u` option sets the upstream branch so future pushes can be done using:

```bash
git push
```

---

## Step 10: Create a Pull Request (PR)

After pushing your branch:

1. Open the GitHub repository.
2. Click **Compare & Pull Request**.
3. Add a meaningful title and description.
4. Submit the Pull Request for review.

Your changes will be reviewed before being merged into the master/main branch.

---

# Useful Git Commands

### Check current branch

```bash
git branch
```

### Check repository status

```bash
git status
```

### View changes

```bash
git diff
```

### View commit history

```bash
git log --oneline
```

### Switch to another branch

```bash
git checkout <branch-name>
```

---

# Best Practices

- ✅ Pull the latest changes before creating a new branch.
- ✅ Work only on your own feature branch.
- ✅ Commit frequently with meaningful commit messages.
- ✅ Keep commits small and focused.
- ✅ Never commit generated files or IDE-specific files unless required.
- ✅ Never push directly to the `master` or `main` branch.
- ✅ Always create a Pull Request for code review.