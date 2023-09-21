package eu.kanade.tachiyomi.animeextension.all.googledrive

fun searchReq(parentId: String, query: String): (String, String, String) -> String {
    return { _: String, nextPageToken: String, key: String ->
        "/drive/v2internal/files?openDrive=false&reason=111&syncType=0&errorRecovery=false&q=title%20contains%20'$query'%20and%20(mimeType%20in%20'application%2Fvnd.google-apps.folder'%20or%20shortcutDetails.targetMimeType%20in%20'application%2Fvnd.google-apps.folder')%20and%20trashed%20%3D%20false%20and%20'$parentId'%20in%20ancestors&fields=kind%2CnextPageToken%2Citems(kind%2CmodifiedDate%2ChasVisitorPermissions%2CcontainsUnsubscribedChildren%2CmodifiedByMeDate%2ClastViewedByMeDate%2CalternateLink%2CfileSize%2Cowners(kind%2CpermissionId%2CemailAddressFromAccount%2Cid)%2ClastModifyingUser(kind%2CpermissionId%2CemailAddressFromAccount%2Cid)%2CcustomerId%2CancestorHasAugmentedPermissions%2ChasThumbnail%2CthumbnailVersion%2Ctitle%2Cid%2CresourceKey%2CabuseIsAppealable%2CabuseNoticeReason%2Cshared%2CaccessRequestsCount%2CsharedWithMeDate%2CuserPermission(role)%2CexplicitlyTrashed%2CmimeType%2CquotaBytesUsed%2Ccopyable%2Csubscribed%2CfolderColor%2ChasChildFolders%2CfileExtension%2CprimarySyncParentId%2CsharingUser(kind%2CpermissionId%2CemailAddressFromAccount%2Cid)%2CflaggedForAbuse%2CfolderFeatures%2Cspaces%2CsourceAppId%2Crecency%2CrecencyReason%2Cversion%2CactionItems%2CteamDriveId%2ChasAugmentedPermissions%2CcreatedDate%2CprimaryDomainName%2CorganizationDisplayName%2CpassivelySubscribed%2CtrashingUser(kind%2CpermissionId%2CemailAddressFromAccount%2Cid)%2CtrashedDate%2Cparents(id)%2Ccapabilities(canMoveItemIntoTeamDrive%2CcanUntrash%2CcanModifyContentRestriction%2CcanMoveItemWithinTeamDrive%2CcanMoveItemOutOfTeamDrive%2CcanDeleteChildren%2CcanTrashChildren%2CcanRequestApproval%2CcanReadCategoryMetadata%2CcanEditCategoryMetadata%2CcanAddMyDriveParent%2CcanRemoveMyDriveParent%2CcanShareChildFiles%2CcanShareChildFolders%2CcanRead%2CcanMoveItemWithinDrive%2CcanMoveChildrenWithinDrive%2CcanAddFolderFromAnotherDrive%2CcanChangeSecurityUpdateEnabled%2CcanBlockOwner%2CcanReportSpamOrAbuse%2CcanCopy%2CcanDownload%2CcanEdit%2CcanAddChildren%2CcanDelete%2CcanRemoveChildren%2CcanShare%2CcanTrash%2CcanRename%2CcanReadTeamDrive%2CcanMoveTeamDriveItem)%2CcontentRestrictions(readOnly)%2CapprovalMetadata(approvalVersion%2CapprovalSummaries%2ChasIncomingApproval)%2CshortcutDetails(targetId%2CtargetMimeType%2CtargetLookupStatus%2CtargetFile%2CcanRequestAccessToTarget)%2CspamMetadata(markedAsSpamDate%2CinSpamView)%2Clabels(starred%2Ctrashed%2Crestricted%2Cviewed))%2CincompleteSearch&appDataFilter=NO_APP_DATA&spaces=drive&pageToken=$nextPageToken&maxResults=50&rawUserQuery=parent%3A$parentId%20type%3Afolder%20title%3A$query&supportsTeamDrives=true&includeItemsFromAllDrives=true&corpora=default&orderBy=relevance%20desc&retryCount=0&key=$key HTTP/1.1"
    }
}

fun defaultGetRequest(folderId: String, nextPageToken: String, key: String): String {
    return "/drive/v2internal/files?openDrive=false&reason=102&syncType=0&errorRecovery=false&q=trashed%20%3D%20false%20and%20'$folderId'%20in%20parents&fields=kind%2CnextPageToken%2Citems(kind%2CmodifiedDate%2ChasVisitorPermissions%2CcontainsUnsubscribedChildren%2CmodifiedByMeDate%2ClastViewedByMeDate%2CalternateLink%2CfileSize%2Cowners(kind%2CpermissionId%2CemailAddressFromAccount%2Cdomain%2Cid)%2ClastModifyingUser(kind%2CpermissionId%2CemailAddressFromAccount%2Cid)%2CcustomerId%2CancestorHasAugmentedPermissions%2ChasThumbnail%2CthumbnailVersion%2Ctitle%2Cid%2CresourceKey%2CabuseIsAppealable%2CabuseNoticeReason%2Cshared%2CaccessRequestsCount%2CsharedWithMeDate%2CuserPermission(role)%2CexplicitlyTrashed%2CmimeType%2CquotaBytesUsed%2Ccopyable%2Csubscribed%2CfolderColor%2ChasChildFolders%2CfileExtension%2CprimarySyncParentId%2CsharingUser(kind%2CpermissionId%2CemailAddressFromAccount%2Cid)%2CflaggedForAbuse%2CfolderFeatures%2Cspaces%2CsourceAppId%2Crecency%2CrecencyReason%2Cversion%2CactionItems%2CteamDriveId%2ChasAugmentedPermissions%2CcreatedDate%2CprimaryDomainName%2CorganizationDisplayName%2CpassivelySubscribed%2CtrashingUser(kind%2CpermissionId%2CemailAddressFromAccount%2Cid)%2CtrashedDate%2Cparents(id)%2Ccapabilities(canMoveItemIntoTeamDrive%2CcanUntrash%2CcanMoveItemWithinTeamDrive%2CcanMoveItemOutOfTeamDrive%2CcanDeleteChildren%2CcanTrashChildren%2CcanRequestApproval%2CcanReadCategoryMetadata%2CcanEditCategoryMetadata%2CcanAddMyDriveParent%2CcanRemoveMyDriveParent%2CcanShareChildFiles%2CcanShareChildFolders%2CcanRead%2CcanMoveItemWithinDrive%2CcanMoveChildrenWithinDrive%2CcanAddFolderFromAnotherDrive%2CcanChangeSecurityUpdateEnabled%2CcanBlockOwner%2CcanReportSpamOrAbuse%2CcanCopy%2CcanDownload%2CcanEdit%2CcanAddChildren%2CcanDelete%2CcanRemoveChildren%2CcanShare%2CcanTrash%2CcanRename%2CcanReadTeamDrive%2CcanMoveTeamDriveItem)%2CcontentRestrictions(readOnly)%2CapprovalMetadata(approvalVersion%2CapprovalSummaries%2ChasIncomingApproval)%2CshortcutDetails(targetId%2CtargetMimeType%2CtargetLookupStatus%2CtargetFile%2CcanRequestAccessToTarget)%2CspamMetadata(markedAsSpamDate%2CinSpamView)%2Clabels(starred%2Ctrashed%2Crestricted%2Cviewed))%2CincompleteSearch&appDataFilter=NO_APP_DATA&spaces=drive&pageToken=$nextPageToken&maxResults=100&supportsTeamDrives=true&includeItemsFromAllDrives=true&corpora=default&orderBy=folder%2Ctitle_natural%20asc&retryCount=0&key=$key HTTP/1.1"
}