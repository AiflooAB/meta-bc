require linphone-sdk.inc

inherit gitpkgv

PR = "${INC_PR}.0"

# 4.4.31
SRCREV = "d4d6356a615e2eec7ea1a957ec40f6fd143f6006"

# TODO set SRCREV to a fixed stable version after merge of yocto-sumo branch

# For visualisation
python () {
    print("")
    print("linphone-sdk")
    print(d.getVar('SRCREV', True))
}

SRC_URI = "gitsm://gitlab.linphone.org/BC/public/linphone-sdk.git;protocol=https;branch=release/4.4;"

PV = "git_${SRCREV}"
PKGV = "${GITPKGVTAG}"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ff3103b5db8ba4e2c66c511b7a73e407"
