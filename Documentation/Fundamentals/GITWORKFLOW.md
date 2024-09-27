# Git Workflow

## Branches

Branches are a way to work on new features or fixes without affecting the main branch's history.

To create a branch:
`git branch <branch name>`

Switch to the new branch:
`git checkout <branch name>`

Work on this branch using `pull`, `add`, `commit`, and `push` commands.

To push the branch to the remote repository:
`git push origin <branch name>`

> Add the `-u` flag to set the upstream branch, so you don't need to specify the remote branch name every time:
`git push -u origin <branch name>`

## Pull requests and other organization practices are crucial to write maintainable, clean code

A pull request (PR) is a way to get review on changes before merging them to the main branch.
To make a pull request, first you need to have changes to merge.
These changes should be on their own, well named branch.
Then go to the pull requests tab on the github repo and hit `new pull request`.
You should be prompted to compare a branch with main.
Select the branch you want to merge.
You should see a list of changes and a green button that says `Create pull request`.
Click that button and then let a software lead or mentor know that you need review.

## Issues

Issues are a way to track features that we want to add and problems we need to fix in the repository.
Issues can be created by going to the issues tab of the repository on github and clicking `New issue`.
PRs can be linked to issues to show that an issue has been worked on and automatically resolve the issue when the PR is merged.

### Resources

- [Github creating a PR](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request)
- [Github about PRs](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests?platform=windows)
- [Github about issues](https://docs.github.com/en/issues/tracking-your-work-with-issues/about-issues)
- [Github linking a PR to an issue](https://docs.github.com/en/issues/tracking-your-work-with-issues/linking-a-pull-request-to-an-issue)

### Exercises

- Create a branch with your name, add your name to the list below, and create a PR with that change.

### Names

- Mario

### Notes

- We use pull requests to make sure our code is readable and maintainable by having regular review of code.