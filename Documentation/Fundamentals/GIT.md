# Basic Git

## Git Overview

Git is a version control system that helps us collaborate on code and manage multiple versions simultaneously.

Unlike cloud applications like Google Docs, which auto-save, Git allows us to save code in named chunks called commits. This makes it easy to revert changes and track who made them. Git also supports branches, enabling parallel development.

### Resources

- [WPILib Git Intro](https://docs.wpilib.org/en/stable/docs/software/basic-programming/git-getting-started.html)
- [GitHub Git Intro](https://docs.github.com/en/get-started/using-git/about-git)
- _Record a quick Git intro video/talk; consult Kevin or a software lead until then_
- [Git Install - Windows](https://gitforwindows.org/)
- [Git Install - Mac](https://git-scm.com/downloads/mac)

### Examples

- `git add .` - This command stages all the changes in your working directory for the next commit. The `.` indicates that all files, including new, modified, and deleted files, should be added.
- `git commit -m "commit message"` - This command creates a new commit with the staged changes. The `-m` flag allows you to include a commit message directly in the command. The commit message should briefly describe the changes made.
- `git push` - This command uploads your local commits to the remote repository, such as GitHub. This makes your changes available to others who have access to the repository.

- `git checkout branch-name` - This command switches your working directory to the specified branch. If the branch does not exist locally, Git will look for it on the remote repository and create a local copy if found.

- `git checkout -b new-branch` - This command creates a new branch named `new-branch` and switches to it immediately. This is useful for starting new features or fixes without affecting the main codebase. Note that the first time you push this new branch to the remote repository, you might need to set the upstream branch with additional parameters, which the terminal will prompt you to do.

- `git status` - This command displays the current state of your working directory and staging area. It shows which changes have been staged, which have not, and which files are not being tracked by Git. This is useful for understanding what changes are ready to be committed.

- `git pull` - This command fetches and integrates changes from the remote repository into your current branch. It is essential to run this command before starting work to ensure you have the latest updates from others. This helps avoid conflicts and ensures you are working on the most recent version of the code.

### Exercises

- Join the LA Streetbots GitHub organization by asking Mario Figueroa to add your account.
- Simple commit:
  - Clone this repository from GitHub.
  - Add your name to the list at the bottom of this file.
  - Commit and push the changes. You may need an auth key; ask a software lead or mentor for help.

### Notes

- _We may start using GitHub's pull request feature; update with current practices._
- Always commit code that compiles (check by running "Build robot code" in WPILib's command bar).
- Keep commit messages short (~10 words). Use multiple lines if necessary.
- Commit frequently, especially when reaching a working state.
- Avoid committing directly to the `main` branch. Develop features on separate branches and merge them in.
- **Always commit before leaving a meeting**, especially on team computers. Uncommitted code can cause issues for others.
- Run `git status` at the start of a meeting to ensure the previous user committed their code and that you are on the correct branch.

### Names

- Mario Figueroa