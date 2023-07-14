/*To Simulate Sequential file allocation Strategy*/
//Program:
#include<stdio.h>
#include<string.h>

int main() {
    int st[20], b[20], b1[20], ch, i, j, n, blocks[20][20], sz[20];
    char F[20][20], S[20];

    printf("\nEnter no. of Files: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        printf("\nEnter file %d name: ", i + 1);
        scanf("%s", F[i]);
        printf("\nEnter file %d size (in kb): ", i + 1);
        scanf("%d", &sz[i]);
        printf("\nEnter Starting block of %d: ", i + 1);
        scanf("%d", &st[i]);
        printf("\nEnter blocksize of File %d (in bytes): ", i + 1);
        scanf("%d", &b[i]);
    }

    for (i = 0; i < n; i++)
        b1[i] = (sz[i] * 1024) / b[i];

    for (i = 0; i < n; i++) {
        for (j = 0; j < b1[i]; j++)
            blocks[i][j] = st[i] + j;
    }

    do {
        printf("\nEnter the Filename: ");
        scanf("%s", S);

        for (i = 0; i < n; i++) {
            if (strcmp(S, F[i]) == 0) {
                printf("\nFname\tStart\tNblocks\tBlocks\n");
                printf("\n\n");
                printf("%s\t%d\t%d\t", F[i], st[i], b1[i]);
                for (j = 0; j < b1[i]; j++)
                    printf("%d->", blocks[i][j]);
            }
        }

        printf("\n\n");
        printf("\nDo you want to continue (Y/n)? ");
        scanf(" %c", &ch);

        if (ch != 'Y' && ch != 'y')
            break;
    } while (1);

    return 0;
}
