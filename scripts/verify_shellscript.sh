DIRECTORY="$HOME/NicolaSec"

SIZE=$(du -sh "$DIRECTORY" | cut -f1)
echo
echo "Tamanho do diretório: $SIZE"

USER=$(stat -c "%U" "$DIRECTORY")
PERMISSIONS=$(stat -c "%A" "$DIRECTORY")
echo "Usuário: $USER"
echo "Permissões: $PERMISSIONS"
echo
