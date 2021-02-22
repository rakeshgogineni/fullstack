:beginner: **git configuration**  

- Git Configuration Information
```sh
C:\Users\Enzo\.gitconfig
```
- user name and email
```sh
Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/mG
$ git config --global user.name 'MavegitUser'

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/mG
$ git config --global user.email MavegitUser@gmail.com

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/mG
$ git config --global --list
core.editor="C:\Users\Enzo\AppData\Local\Programs\Microsoft VS Code\Code.exe" --wait
credential.helper=wincred
credential.modalprompt=never
user.email=MavegitUser@gmail.com
user.name=MavegitUser

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/mG
$ git config --global --unset user.name

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/mG
$ git config --global --list
core.editor="C:\Users\Enzo\AppData\Local\Programs\Microsoft VS Code\Code.exe" --wait
credential.helper=wincred
credential.modalprompt=never
user.email=MavegitUser@gmail.com

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/desktop/mG
$ git config --global user.name 'MavegitUser'

```

