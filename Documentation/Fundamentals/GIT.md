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

- `git add .` then `git commit -m "commit message"` then `git push` - the basic Git workflow.
- `git checkout branch-name` - switch branches.
- `git checkout -b new-branch` - create and switch to a new branch. The first push from this branch may require extra parameters; the terminal will prompt you.
- `git status` - show the current branch and changes.
- `git pull` - update your local code with the latest from GitHub. Do this if others have worked on the same branch to avoid conflicts.

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