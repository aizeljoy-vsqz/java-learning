# Week 1: 
- Git
-

<br/>

---
### Running With Git

---
*Git is a version control system*
- used to record file changes
- used to revert file changes to its previous changes
- used to compare changes

**3 Stages of a File**
1. *commited* - the file saved to local repo
2. *modified* - the file has been altered (working area)
3. *staged* - the file has been picked to save for the next commit.

**3 Main Part of a Git Project**
1. *git directory* - file are recorded and commited
2. *working directory* - changes  in files, not yet added to staging
3. *staging area* - file added to be staged in the next commit.

**Using Command Line**
- `pwd` - returns the current folder path location
- `cd` (change directory) - move into another directory
- `cd..` - go up one directory.
- `cd~` - jump to te beginning home folder.
- `dir` - list files in a directory
- `mkdir` - create new empty folder
- `copy con` - creates new file
- `New-Item` - creates new file (power shell)

**Configure Git**
- `git config --global user.name "yourName"`
- `git config --global user.email "yourEmail"`

**Initialize Git**
- `git init`

<br/>

---
### Basic Commands of Every Git

---
- `clear` - move the history out of view
- `git status` - shows the state of a project
- `git add` - use to track new files as well as add modified to be staged.
- `git status -s` or `git status --short` - show the state of a project in smaller and concise way.
  - A - New file added to staging area
  - M - Modified
  - ?? - New file untracked by git
- `git diff` - use if you want to see the actual changes being made in the file
  - you can use git diff to answer two questions:
    - What changes have I staged that are ready to be committed? 
    - What changes I have made but not staged?
  - shows changes that haven't been staged
- `git diff --staged` - compares staged changes to last commit snapshot. 
  - shows the information changes that are staged.
- `git diff --staged --no--renames`
- `git commit` - use to commit change to the repository
- `git -a -m` - shortcut to skip the staging area and jump to commiting the changes

*notes:*
- origin is the repository in GitHub
- when you initialized your git repo it automatically creates the master branch 
- git only cares about hash reference of a file to keep track of its content.

<br/>

---
### Extended Commands of Git  

---

- `git push` - to publish your local commits.
- `git push origin <branchName>` - send your changes to your origin project in GitHub.
- `git log` - to view your existing commit history (including , SHA-1 hash, author, date, commit message)
- `git log -1` - shows limited number of commits to show.
- `git log --oneline` - shows all the commit list in a single line format
- `git log --stat` - detailed view of each commit
- `git log --patch` - more detailed view of each commit compare to stat

**Commit Message**  
*7 rules & guidelines for writing a commit message.*  
1. Separate subject  from body with a blank line.
2. Limit the subject line to 50 characters
3. Capitalized the subject  line
4. Do not end the subject line with a period.
5. Use the imperative mood in the subject line.
6. Wrap the body at 72 characters.
7. Use the body to explain what and why vs. how  


**Remove & Move Files**  
- `git rm <fileName>` -  staged the file's removal and git has stopped tracking the file.
- `git rm --cached <fileName>` - untrack the file from git but not in the project. (// file will be untracked)
- `git mv <fileName> <newFileName>` - renaming file

**Git Branches**
- `git checkout -b <branchName>` - `checkout` lets you checkout to a different branch `-b` create new branch then checkout to it.
- `git checkout <branchName>` - checkout to the branch
- `git stash` - use to record the current state of the working directory and staging area and go back to a clean directory.
- `git stash list` - list of work-in-progress changes that you've stashed.
- `git stash show` - detailed view of what file was stashed 
- `git stash pop` - get the stash back

**Git Merge**  
*Merging a branch into another  branch is key concept with branching*  
- `git merge <branchName> `
  - i - to enter the interactive mode 
  - then write your merge message.
  - when done hit the esc key followed by :wq // w-save changes q-quit

**Reset**  
- `git reset` - allows us to move commits from history back into working stage or staging area  
  - remember: it's nnot best practice to reset changes once pushed commits to remote where other collaborator could have accessed the changes
- `git reset --soft` - moves to staging area
- `git reset --mixed` - moves to the working directory
- `git reset --hard` - moves changes to the trash

**Pull From Remote Origin**
- copy https: from GitHub.
- `git clone <url>`

<br/>

### Next...


