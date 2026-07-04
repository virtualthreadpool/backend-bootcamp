# Developer Guide: Setting Up SSH Keys for GitHub

Using SSH keys allows you to securely push and pull code from GitHub
without entering your password or a Personal Access Token (PAT) every
single time.

## Step 1: Open Your Terminal

Depending on your Operating System, open the following application:

-   **Windows:** Open Git Bash (installed with Git) or PowerShell.
-   **Mac / Linux:** Open the standard Terminal.

## Step 2: Generate a New SSH Key

Paste the following command, replacing the email with your own GitHub
account email:

``` bash
ssh-keygen -t ed25519 -C "your_email@example.com"
```

> **Note:** If you are using an older legacy system that doesn't support
> the modern Ed25519 algorithm, use:
>
> ``` bash
> ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
> ```

### When prompted:

-   **Enter a file in which to save the key:** Press **Enter** to accept
    the default location.
-   **Enter passphrase:** Enter a secure passphrase (optional but
    recommended), or press **Enter** twice to leave it empty.

## Step 3: Copy Your Public SSH Key to Clipboard

### Windows (Git Bash)

``` bash
clip < ~/.ssh/id_ed25519.pub
```

### Mac

``` bash
pbcopy < ~/.ssh/id_ed25519.pub
```

### Linux

``` bash
cat ~/.ssh/id_ed25519.pub
```

If using Linux, manually copy the output displayed.

## Step 4: Add the SSH Key to GitHub

1.  Log in to your GitHub account.
2.  Click your profile photo (top-right) → **Settings**.
3.  Select **SSH and GPG keys**.
4.  Click **New SSH key**.
5.  Enter a descriptive **Title** (e.g., *Work Laptop* or *Personal
    Mac*).
6.  Keep **Key type** as **Authentication Key**.
7.  Paste your public key into the **Key** field.
8.  Click **Add SSH key**.

## Step 5: Test the Connection

Run:

``` bash
ssh -T git@github.com
```

If prompted:

    The authenticity of host 'github.com (...)' can't be established...
    Are you sure you want to continue connecting (yes/no/[fingerprint])?

Type:

``` text
yes
```

If everything is configured correctly, you'll see:

``` text
Hi username! You've successfully authenticated, but GitHub does not provide shell access.
```
