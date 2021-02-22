```js
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/jfs (main)
$ git branch --list
* main

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/jfs (main)
$ git branch -l
* main

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/jfs (main)
$ git branch -M master

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/jfs (master)
$ git branch -l
* master

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/jfs (master)
$ git branch -m master

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/jfs (master)
$ git branch -l
* master

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/jfs (master)
$ git branch -M main

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/jfs (main)
$ git branch -l
* main

```

:newspaper: **logs** ..  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ touch painting.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git add .

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git commit -am "Painted"
[main a70a129] Painted
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 painting.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ touch frame.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git add .

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git commit -am "Framed"
[main bfa588a] Framed
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 frame.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git log -3
commit bfa588a7841646790b2bb673e71a9d89aed5d2a6 (HEAD -> main)
Author: mavegituser <livegit2@gmail.com>
Date:   Tue Jan 5 16:32:42 2021 +0530

    Framed

commit a70a129325e9d78deaee3f918acd3c56177e3bda
Author: mavegituser <livegit2@gmail.com>
Date:   Tue Jan 5 16:32:25 2021 +0530

    Painted

commit 2ca575d0014d5bcc4a51926851c3b741062fb5b9
Author: mavegituser <livegit2@gmail.com>
Date:   Tue Jan 5 16:31:02 2021 +0530

    OLD COMMITS

```
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git add .

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git commit -m "c3"
[main 1856217] c3
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 3.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git log --oneline -5
1856217 (HEAD -> main) c3
8eccb7a c1
e461faf CLEAN UP 1
b1e923d temp commit
bfa588a Framed

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git checkout -b branch2
Switched to a new branch 'branch2'

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (branch2)
$ git branch
  branch1
* branch2
  main

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (branch2)
$ git checkout main
Switched to branch 'main'
Your branch is ahead of 'origin/main' by 16 commits.
  (use "git push" to publish your local commits)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git branch -d branch2
Deleted branch branch2 (was 1856217).

```

:beginner: **branches**  
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git branch
* main

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git branch branch1

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git branch
  branch1
* main

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git branch -d branch1
Deleted branch branch1 (was e461faf).

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git branch
* main

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ touch 1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git add .

```
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git commit -m "c1"
[main 8eccb7a] c1
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 1.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git log --oneline -5
8eccb7a (HEAD -> main) c1
e461faf CLEAN UP 1
b1e923d temp commit
bfa588a Framed
a70a129 Painted

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git branch branch1

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (main)
$ git checkout branch1
Switched to branch 'branch1'
M       git/work.md

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (branch1)
$ touch 2.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (branch1)
$ git add .

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/mG/jfs (branch1)
$ git commit -m "c2"
[branch1 fc5f2b4] c2
 2 files changed, 31 insertions(+)
 create mode 100644 2.txt

```


